package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.Courses;
import com.example.main.service.CourseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class CourseController {

	@Autowired
	CourseService service;
	
	@Operation(summary = "Creates a new Course")
	@ApiResponses(value = {@ApiResponse(responseCode = "201",description = "Course created successfully"),
			     @ApiResponse(responseCode = "400",description = "Course is invalid")})
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(produces = "application/json",consumes = "application/json",value = "/createCourse")
	public String createCourse(@RequestBody Courses c) {
		
		return service.createCourse(c);
	}
	
	@Operation(summary = "Read all Courses")
	@ApiResponses(value = {@ApiResponse(responseCode = "201",description = "Courses Read successfully"),
			     @ApiResponse(responseCode = "400",description = "Course List is empty Or Invalid Request")})
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping(produces = "application/json",value = "/getAll")
	public List<Courses> getAll(){
		
		return service.getAll();
	}
	
	@Operation(summary = "Delete a Course with id")
	@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Course deleted successfully"),
			@ApiResponse(responseCode = "401", description = "Invalid Credentials"),
			@ApiResponse(responseCode = "404", description = "Course not found")})
	@DeleteMapping(value = "/deleteCourse/{id}")
	public String deleteCourse(@PathVariable("id") int id) {
		
		return service.deleteCourse(id);
	}
}
