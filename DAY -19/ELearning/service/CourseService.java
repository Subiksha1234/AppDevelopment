package com.example.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.entity.Courses;
import com.example.main.repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo course;
	
	public String createCourse(Courses c) {
		
		course.save(c);
		return "Posted. . .";
	}
	
	public List<Courses> getAll(){
		
		return course.findAll();
	}
	
	public Optional<Courses> getById(int id) {
		
		return course.findById(id);
	}
	
	public String deleteCourse(int id) {
		
		course.deleteById(id);
		return "Courses Deleted. . .";
	}

}
