package com.hyla.application.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyla.application.model.Job;
import com.hyla.application.model.ResultResponseDto;
import com.hyla.application.model.Resume;
import com.hyla.application.model.Review;
import com.hyla.application.service.JobService;
import com.hyla.application.service.ResumeService;
import com.hyla.application.service.ReviewService;

/**
 * Api - Controller to handle Create, Update of job postingsa and retrieving them,
 * and other admin services needed for the application users.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/portalMain")
public class PortalController {
	private static final Logger logger = LoggerFactory.getLogger(PortalController.class);

	@Autowired
	JobService jservice;
	
	@Autowired
	ResumeService rservice;
	
	@Autowired
	ReviewService vservice;
	
    @GetMapping(value= "/job/getall", produces= "application/vnd.jcg.api.v1+json")
    public List<Job> getAllJobs() {
    	logger.info("Getting job listing from the database.");
        return jservice.getAll();
    }
    
    @PostMapping(value= "/job/save")
    public int saveJob(final @RequestBody Job job) {
    	logger.info("Saving job listing in the database.");
    	jservice.save(job);
        return job.getId();
    }
    
    @GetMapping(value= "/resume/getall", produces= "application/vnd.jcg.api.v1+json")
    public List<Resume> getAllResumes() {
    	logger.info("Getting resumes from the database.");
        return rservice.getAll();
    }
    
    @PostMapping(value= "/resume/save")
    public int saveResume(final @RequestBody Resume res) {
    	logger.info("Saving resumes in the database.");
        rservice.save(res);
        return res.getId();
    }
    
    @GetMapping(value= "/review/getall", produces= "application/vnd.jcg.api.v1+json")
    public List<Review> getAllReviews() {
    	logger.info("Getting review steps from the database.");
        return vservice.getAll();
    }
    
    @PostMapping(value= "/review/save")
    public int saveReview(final @RequestBody Review rev) {
    	logger.info("Saving review steps in the database.");
    	vservice.save(rev);
        return rev.getId();
    }
    
}
