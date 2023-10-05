package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.Courses;
import com.example.main.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService service;
	
	@PostMapping("/createCourse")
	public String createCourse(@RequestBody Courses c) {
		
		return service.createCourse(c);
	}
	
	@GetMapping("/getAll")
	public List<Courses> getAll(){
		
		return service.getAll();
	}
}
