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
    // 3, // int id
    // "Company", // String company
    // "Title", // String title
    // 123L, // Long category_id (example value, replace as needed)
    // "location", // String location (fixed typo)
    // "short_description", // String short_description
    // "long_description", // String long_description
    // "instructions", // String instructions
    // "status", // String status
    // "job_listing_type", // String job_listing_type
    // LocalDateTime.now(), // LocalDateTime created_at
    // LocalDateTime.now(), // LocalDateTime updated_at
    // LocalDateTime.now() // LocalDateTime deleted_at
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

    public String addJob(String entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addJob'");
    }

}
