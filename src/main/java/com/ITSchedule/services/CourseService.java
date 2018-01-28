package com.ITSchedule.services;

import com.ITSchedule.models.Course;

import java.util.List;

public interface CourseService{
	Course set(Course subject);
	Course getById(String id);
	boolean deleteById(String id);
	List<Course> getAll();
}
