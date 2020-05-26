package com.hyla.application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resume implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private int id;
	private int jobId;
	private Date date;
	private String vendor_company;
	private String vendor_rep;
	private String vendor_email;
	private String candidate_fname;
	private String candidate_lname;
	private String candidate_exp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int job_id) {
		this.jobId = job_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getVendor_company() {
		return vendor_company;
	}

	public void setVendor_company(String vendor_company) {
		this.vendor_company = vendor_company;
	}

	public String getVendor_rep() {
		return vendor_rep;
	}

	public void setVendor_rep(String vendor_rep) {
		this.vendor_rep = vendor_rep;
	}

	public String getVendor_email() {
		return vendor_email;
	}

	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}

	public String getCandidate_fname() {
		return candidate_fname;
	}

	public void setCandidate_fname(String vendor_fname) {
		this.candidate_fname = vendor_fname;
	}

	public String getCandidate_lname() {
		return candidate_lname;
	}

	public void setCandidate_lname(String vendor_lname) {
		this.candidate_lname = vendor_lname;
	}

	public String getCandidate_exp() {
		return candidate_exp;
	}

	public void setCandidate_exp(String candidate_exp) {
		this.candidate_exp = candidate_exp;
	}

	public Resume(int job_id, Date date, String vendor_company, String vendor_rep, String vendor_email,
			String vendor_fname, String vendor_lname, String candidate_exp) {
		super();
		this.jobId = job_id;
		this.date = date;
		this.vendor_company = vendor_company;
		this.vendor_rep = vendor_rep;
		this.vendor_email = vendor_email;
		this.candidate_fname = vendor_fname;
		this.candidate_lname = vendor_lname;
		this.candidate_exp = candidate_exp;
	}

	public Resume() {
		// TODO Auto-generated constructor stub
	}

}
