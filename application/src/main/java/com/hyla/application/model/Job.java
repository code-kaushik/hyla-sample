package com.hyla.application.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private int id;
	private String job_title;
    private String job_description;
    private String wage_max;
    private String wage_min;
    public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public String getWage_max() {
		return wage_max;
	}
	public void setWage_max(String wage_max) {
		this.wage_max = wage_max;
	}
	public String getWage_min() {
		return wage_min;
	}
	public void setWage_min(String wage_min) {
		this.wage_min = wage_min;
	}
	public Job() {
    	//default constructor
    }
	
	public Job(int id, String job_title, String job_description, String wage_max, String wage_min) {
		super();
		this.id = id;
		this.job_title = job_title;
		this.job_description = job_description;
		this.wage_max = wage_max;
		this.wage_min = wage_min;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
