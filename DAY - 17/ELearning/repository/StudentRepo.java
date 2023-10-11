package com.example.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.main.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	
	@Query("select count(*) from Student s where s.student_id = ?1")
	public List<Integer> studentExist(long Id);

}
