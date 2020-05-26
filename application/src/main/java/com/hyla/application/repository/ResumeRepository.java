package com.hyla.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hyla.application.model.Resume;

@Repository
public interface ResumeRepository extends CrudRepository<Resume, Integer> {


}
