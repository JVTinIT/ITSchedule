package com.ITSchedule.controllers;

import com.ITSchedule.models.Student;
import com.ITSchedule.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController{

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/new", consumes = "application/json")
	public Student addOrEdit(@RequestBody Student student) {
		return studentService.set(student);
	}

	@GetMapping("/{id}")
	public Student getOne(@PathVariable String id) {
		return studentService.getById(id);
	}

	@GetMapping("/all")
	public List<Student> getAll() {
		return studentService.getAll();
	}

	@DeleteMapping("/del/{id}")
	public boolean delete(@PathVariable String id) {
		return studentService.deleteById(id);
	}

}
