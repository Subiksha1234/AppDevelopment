package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.userRepo;

@Service
@Component
public class UserService {
	
	@Autowired
	userRepo repo;
	
	public boolean createUser(Users u) {
		
//		int count = repo.emailExists(u.getEmail());
//		if(count == 0) {
//			return true;
//		}
//		else 
		repo.save(u);
			return false;
	}
	
	public boolean readUser(String email,String password){
		
//		List<Integer> count = repo.emailExists(email);
//		if(count.get(0) == 1) {
//			
//			String orgPassword = repo.passwordExists(email);
//			if(orgPassword.equals(password)) {
//				return true;
//			}
//			else {
//				
//				return false;
//			}
//		}
//		else
			return false;
		
	}

}
