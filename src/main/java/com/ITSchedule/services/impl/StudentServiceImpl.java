package com.ITSchedule.services.impl;

import com.ITSchedule.models.Student;
import com.ITSchedule.repositories.StudentRepository;
import com.ITSchedule.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	public Student getById(String id) {
		return studentRepository.getById(id);
	}

	public Student set(Student student) {
		studentRepository.save(student);
		return getById(student.getId());

	}

	public boolean deleteById(String id) {
		studentRepository.deleteById(id);
		return studentRepository.getById(id)==null;
	}

	public List<Student> getAll() {
		List<Student> studentList = new ArrayList<>();
		studentList.addAll(studentRepository.findAll());
		return studentList;
	}
}
