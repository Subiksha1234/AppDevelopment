package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Transactional
@Entity
@Table(name = "courses")
public class Courses {
	
	@Id
	public int id;
	public String courseName;
	public String instructor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public Courses() {
		super();
	}
	public Courses(int id, String courseName, String instructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
	}

}
