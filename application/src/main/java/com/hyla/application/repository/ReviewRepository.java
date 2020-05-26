package com.hyla.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hyla.application.model.Review;
import com.hyla.application.model.ResultResponseDto;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
	
//	@Query(value = "SELECT u,r.vendor_company,concat(r.candidate_fname,r.candidate_lname) FROM Review u outer join Resume r on u.resumeId=r.id ")
//	List<ResultResponseDto> findFullUsers();
}
