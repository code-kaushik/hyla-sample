package com.hyla.application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ResultResponseDto implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
    private String vendor_company;
    private String candidate_name;
    
	private Date resume_review_date;
	private Status resume_review;
	private Date phone_screen_date;
	private Status phone_screen_review;
	private Date interview_date;
	private Status interview_review;
	private String comment = "N/A";


	public Date getResume_review_date() {
		return resume_review_date;
	}

	public void setResume_review_date(Date resume_review_date) {
		this.resume_review_date = resume_review_date;
	}

	public Status getResume_review() {
		return resume_review;
	}

	public void setResume_review(Status resume_review) {
		this.resume_review = resume_review;
	}

	public Date getPhone_screen_date() {
		return phone_screen_date;
	}

	public void setPhone_screen_date(Date phone_screen_date) {
		this.phone_screen_date = phone_screen_date;
	}

	public Status getPhone_screen_review() {
		return phone_screen_review;
	}

	public void setPhone_screen_review(Status phone_screen_review) {
		this.phone_screen_review = phone_screen_review;
	}

	public Date getInterview_date() {
		return interview_date;
	}

	public void setInterview_date(Date interview_date) {
		this.interview_date = interview_date;
	}

	public Status getInterview_review() {
		return interview_review;
	}

	public void setInterview_review(Status interview_review) {
		this.interview_review = interview_review;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ResultResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public String getVendor_company() {
		return vendor_company;
	}

	public void setVendor_company(String vendor_company) {
		this.vendor_company = vendor_company;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
