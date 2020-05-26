package com.hyla.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyla.application.repository.JobRepository;
import com.hyla.application.repository.ReviewRepository;
import com.hyla.application.model.Job;
import com.hyla.application.model.ResultResponseDto;
import com.hyla.application.model.Review;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepo;
	
	public void save(final Review rev) {
		reviewRepo.save(rev);
	}
	
	public List<Review> getAll(){
		final List<Review> reviews = new ArrayList<>();
		reviewRepo.findAll().forEach(e -> reviews.add(e));
		return reviews;
	}
	
	//need to update the query to fetch right columns from resume and review tables.
//	public List<ResultResponseDto> findFullResults(){
//		final List<ResultResponseDto> reviews = new ArrayList<>();
//		reviewRepo.findFullUsers().forEach(e -> reviews.add(e));
//		return reviews;
//	}
	

}
