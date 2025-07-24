package com.hms.experience.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.hms.experience.dao.JobDao;
import com.hms.experience.entity.JobEntity;
import com.hms.experience.exceptions.JobListNotFundException;

@Service
public class JobService implements job {

    private JobEntity list;
    private JobDao jobDao;

    public JobService(JobDao theJobDAO) {
        this.jobDao = theJobDAO;
    }

    // @PostConstruct
    // private ArrayList<JobList> loadJobListData() {

    // list = new JobList(

    // );
    // ArrayList<JobList> joblist = new ArrayList<>();
    // joblist.add(list);
    // // return (ArrayList<JobList>) jobDao.getJobList();
    // return joblist;
    // }

    @Override
    public ArrayList<JobEntity> getJobList() {
        return (ArrayList<JobEntity>) jobDao.getJobList();
        // return loadJobListData();
    }

    @Override
    public ArrayList<JobEntity> getJoblistById(int id) {

        /* */
        ArrayList<JobEntity> jobList = (ArrayList<JobEntity>) jobDao.getJobList();
        ArrayList<JobEntity> filteredJobs = new ArrayList<>();
        for (JobEntity job : jobList) {
            if (job.getId() == id) {
                filteredJobs.add(job);
            }
        }
        if (id <= 0 || filteredJobs == null || filteredJobs.isEmpty()) {
            // throw jobListException.JobListNotFoundException("not found.");
            throw new JobListNotFundException("Not found");
        }
        // .stream()
        // .filter(job -> job.getId() == id)
        // .collect(java.util.stream.Collectors.toCollection(ArrayList::new));
        return filteredJobs;

    }

    public JobEntity addJob(JobEntity entity) {
        return jobDao.insertRecord(entity);
    }

}
