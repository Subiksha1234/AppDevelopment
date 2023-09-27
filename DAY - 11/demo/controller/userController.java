package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

@CrossOrigin
@RestController
public class userController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/post")
	public boolean createUser(@RequestBody Users u){
		
		return service.createUser(u);
		
	}
	
	@GetMapping("/get")
	public boolean readUser(@RequestParam String email, @RequestParam String password){
		
		return service.readUser(email,password);
	}
	
}
