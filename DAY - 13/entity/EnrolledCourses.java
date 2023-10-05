//package com.example.main.entity;
//
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "enrolled_courses")
//public class EnrolledCourses {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String courseName;
//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	private List<User> user;
//	
//	public EnrolledCourses() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public EnrolledCourses(int id, String courseName, List<User> user) {
//		super();
//		this.id = id;
//		this.courseName = courseName;
//		this.user = user;
//	}
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getCourseName() {
//		return courseName;
//	}
//	public void setCourseName(String courseName) {
//		this.courseName = courseName;
//	}
//	public List<User> getUser() {
//		return user;
//	}
//	public void setUser(List<User> user) {
//		this.user = user;
//	}
//	
//
//}
