package com.ITSchedule.services.impl;

import com.ITSchedule.models.Course;
import com.ITSchedule.repositories.CourseRepository;
import com.ITSchedule.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;

	public Course set(Course course){
		courseRepository.save(course);
		return getById(course.getId());
	}

	public Course getById(String id){
		return courseRepository.getById(id);
	}

	public boolean deleteById(String id) {
		courseRepository.deleteById(id);
		return courseRepository.getById(id) == null;
	}

	public List<Course> getAll(){
		List<Course> courses= new ArrayList<>();
		courses.addAll(courseRepository.findAll());
		return courses;
	}
}
