package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.constant.Api;
import com.example.main.entity.Instructor;
import com.example.main.service.InstructorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(Api.USER)
public class InstructorController {
	
	@Autowired
	InstructorService service;
	
	@Operation(summary = "Creates a new Instructor")
	@ApiResponses(value = {@ApiResponse(responseCode = "201",description = "Instructor created successfully"),
			     @ApiResponse(responseCode = "400",description = "Data is invalid")})
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(produces = "application/json",consumes = "application/json",value = "/createInstructor")
	public String createInstructor(@RequestBody Instructor i) {
		
		return service.createInstructor(i);
	}
	
	@Operation(summary = "Read all Instructors")
	@ApiResponses(value = {@ApiResponse(responseCode = "201",description = "Instructors Read successfully"),
			     @ApiResponse(responseCode = "400",description = "Instructor List is empty Or Invalid Request")})
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping(produces = "application/json",value = "/getallInstructor")
	public List<Instructor> getInstructors(){
		
		return service.getInstructors();
	}

}
