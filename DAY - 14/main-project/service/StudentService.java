
package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.entity.Courses;
import com.example.main.entity.Student;
import com.example.main.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public String enrollCourse(Student s) {
		
//		Courses c = s.getEnrolledCourses().get(0);
//		List<Integer> list = repo.alreadyEnrolled(c.getCourse_id(), s.getStudent_id());
//		
//		if(list.get(0) == 0) {
			
			repo.save(s);
			return "Enrolled. . .";
//		}
//		else {
//			
//			return "Already Enrolled. . .";
//		}
	}
	
	public List<Courses> getEnrolled(long id){
		
		return repo.findById(id).get().getEnrolledCourses();
	}

}
