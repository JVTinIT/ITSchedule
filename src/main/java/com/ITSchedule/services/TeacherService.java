package com.ITSchedule.services;

import com.ITSchedule.models.Teacher;

import java.util.List;

public interface TeacherService{
	Teacher save(Teacher teacher);
	Teacher getById(String id);
	boolean deleteById(String id);
	List<Teacher> getAll();
}
