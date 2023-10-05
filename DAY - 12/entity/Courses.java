package com.example.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int course_id;
	private String courseName;
	private String duration;
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(String courseName, String duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

}
