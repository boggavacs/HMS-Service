package com.hms.experience.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hms.experience.dao.JobDao;
import com.hms.experience.entity.JobEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

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

    @Override
    @Transactional
    public JobEntity insertRecord(JobEntity jlist) {
        JobEntity jobList = new JobEntity();
        jobList.setTitle(jlist.getTitle());
        jobList.setCompany(jlist.getCompany());
        jobList.setLocaion(jlist.getLocaion());
        jobList.setShort_description(jlist.getShort_description());
        jobList.setLong_description(jlist.getLong_description());
        jobList.setInstructions(jlist.getInstructions());
        jobList.setStatus(jlist.getStatus());
        jobList.setJob_listing_type(jlist.getJob_listing_type());
        jobList.setCreated_at(LocalDateTime.now());
        jobList.setUpdated_at(LocalDateTime.now());
        jobList.setExpires_at(LocalDateTime.now());
        jobList.setCategory_id(jlist.getCategory_id());
        entityManager.persist(jobList);
        return jobList;
    }

}
