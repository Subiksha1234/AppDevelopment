//package com.example.main.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.main.entity.EnrolledCourses;
//import com.example.main.service.EnrolledCoursesService;
//
//@RestController
//public class EnrolledCoursesController {
//	
//	@Autowired
//	EnrolledCoursesService service;
//	
//	@PostMapping("/postEnrolled")
//	public String post(@RequestBody EnrolledCourses e) {
//		
//		return service.post(e);
//	}
//	
//	@GetMapping("/getEnrolled")
//	public List<EnrolledCourses> getEnrolled(){
//		
//		return service.getEnrolled();
//	}
//
//}
