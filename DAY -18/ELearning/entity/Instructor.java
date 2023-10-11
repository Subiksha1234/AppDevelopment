package com.example.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {
	
	@Id
	private int instructor_id;
	private String instructorName;
	private String experience;
	private String teaching;
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instructor(int instructor_id, String instructorName, String experience, String teaching) {
		super();
		this.instructor_id = instructor_id;
		this.instructorName = instructorName;
		this.experience = experience;
		this.teaching = teaching;
	}
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getTeaching() {
		return teaching;
	}
	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}

}
