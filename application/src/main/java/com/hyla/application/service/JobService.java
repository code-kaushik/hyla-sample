package com.hyla.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyla.application.repository.JobRepository;
import com.hyla.application.model.Job;

@Service
public class JobService {
	
	@Autowired
	JobRepository jobRepo;
	
	public void save(final Job job) {
		jobRepo.save(job);
	}
	
	public List<Job> getAll(){
		final List<Job> jobs = new ArrayList<>();
		jobRepo.findAll().forEach(e -> jobs.add(e));
		return jobs;
	}
	

}
