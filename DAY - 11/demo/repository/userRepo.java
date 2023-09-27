package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
@Component
public interface userRepo extends JpaRepository<Users, Integer>{
	
//	@Query("select count(*) from  users u where u.email = ?1")
//	public int emailExists(String email);
	
	//@Query("select password from users u where u.email = ?1")
	//public String passwordExists(String email);
	

}
