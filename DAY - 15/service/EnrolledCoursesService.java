//package com.example.main.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.main.entity.EnrolledCourses;
//import com.example.main.repository.EnrolledCoursesRepo;
//
//@Service
//public class EnrolledCoursesService {
//	
//	@Autowired
//	EnrolledCoursesRepo repo;
//	
//	public String post(EnrolledCourses e) {
//		
//		repo.save(e);
//		return "Posted. . .";
//	}
//	
//	public List<EnrolledCourses> getEnrolled(){
//		
//		return repo.findAll();
//	}
//
//}
