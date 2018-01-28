package com.ITSchedule.controllers;

import com.ITSchedule.models.Course;
import com.ITSchedule.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController{

	@Autowired
	private CourseService courseService;

	@PostMapping(value = "/new", consumes = "application/json")
	public Course addOrEdit(@RequestBody Course course) {
		return courseService.set(course);
	}

	@GetMapping("/{id}")
	public Course getById(@PathVariable String id) {
		return courseService.getById(id);
	}

	@GetMapping("/all")
	public List<Course> getAll() {
		return courseService.getAll();
	}

	@DeleteMapping("/del/{id}")
	public boolean delete(@PathVariable String id) {
		return courseService.deleteById(id);
	}

}
