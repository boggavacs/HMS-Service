package com.hms.experience.service;

import java.util.ArrayList;
import java.util.List;

import com.hms.experience.entity.JobEntity;

public interface job {

    public ArrayList<JobEntity> getJobList();

    public List<JobEntity> getJoblistById(int id);

}
