package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.constant.Api;
import com.example.main.entity.User;
import com.example.main.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(Api.USER)
public class UserController {
	
	@Autowired
	UserService service;
	
	@Operation(summary = "Update an User with id")
	@ApiResponses(value = {@ApiResponse(responseCode = "200",description = "User updated successfully"),
			              @ApiResponse(responseCode = "400",description = "Invalid Credentials"),
			              @ApiResponse(responseCode = "401",description = "User not found")})
	@PutMapping(produces = "application/json",consumes = "application/json",value = "/updateUser/{id}")
	public String update(@RequestBody User u,@PathVariable("id") long id) {
		
		return service.update(u,id);
	}
	
	@Operation(summary = "Delete an User with id")
	@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "User deleted successfully"),
			@ApiResponse(responseCode = "401", description = "Invalid Credentials"),
			@ApiResponse(responseCode = "404", description = "User not found")})
	@DeleteMapping(value = "/deleteUser/{id}")
	public String delete(@PathVariable("id") long id) {
		
		return service.delete(id);
	}
}
