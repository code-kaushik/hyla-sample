package com.hyla.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyla.application.repository.JobRepository;
import com.hyla.application.repository.ResumeRepository;
import com.hyla.application.model.Job;
import com.hyla.application.model.Resume;

@Service
public class ResumeService {
	
	@Autowired
	ResumeRepository resRepo;
	
	public void save(final Resume res) {
		resRepo.save(res);
	}
	
	public List<Resume> getAll(){
		final List<Resume> ress = new ArrayList<>();
		resRepo.findAll().forEach(e -> ress.add(e));
		return ress;
	}
	

}
