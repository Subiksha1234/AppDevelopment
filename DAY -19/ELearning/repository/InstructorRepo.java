package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.entity.Instructor;

public interface InstructorRepo extends JpaRepository<Instructor, Integer>{

}
