package com.hms.experience.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hms.experience.dao.JobDao;
import com.hms.experience.entity.JobEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class JobRepository implements JobDao {

    private EntityManager entityManager;

    public JobRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<JobEntity> getJobList() {
        TypedQuery<JobEntity> getJobsQuery = entityManager.createQuery("from JobEntity", JobEntity.class);
        List<JobEntity> getJobs = getJobsQuery.getResultList();
        return getJobs;
    }

    // @Override
    // public JobEntity insertRecord() {
    // // company,
    // // title,
    // // category_id,
    // // location,
    // // short_description,
    // // long_description,
    // // instructions,
    // // status,
    // // job_listing_type,
    // // created_at,
    // // updated_at,
    // // expires_at
    // JobEntity list = new JobEntity();
    // list.setCompany("HMS");
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'insertRecord'");
    // }

}
