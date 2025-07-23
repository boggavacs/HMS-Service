package com.hms.experience.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.experience.entity.JobEntity;
import com.hms.experience.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/job")
public class JobListController {

    @Autowired
    JobService jobService;

    @GetMapping("/list")
    public ArrayList<JobEntity> getMethodName() {
        var list = jobService.getJobList();
        return list;
    }

    @GetMapping("/list/{id}")
    public List<JobEntity> getMethodName(@PathVariable int id) {
        return jobService.getJoblistById(id);
    }

    @PostMapping("/add")
    public String addJobListing(@RequestBody String entity) {
        return jobService.addJob(entity);
    }

}
