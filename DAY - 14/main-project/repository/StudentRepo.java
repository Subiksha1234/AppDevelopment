package com.example.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.main.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	
//	@Query("select count(*) where course_id = ?1 and student_id = ?2")
//	public List<Integer> alreadyEnrolled(int id,long Id);

}
