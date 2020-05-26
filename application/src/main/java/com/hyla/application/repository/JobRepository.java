package com.hyla.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hyla.application.model.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {


}
