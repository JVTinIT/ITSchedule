package com.ITSchedule.services;

import com.ITSchedule.models.Student;

import java.util.List;

public interface StudentService{
	Student set(Student student);
	Student getById(String id);
	boolean deleteById(String id);
	List<Student> getAll();
}
