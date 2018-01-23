package com.ITSchedule.services;

import com.ITSchedule.models.Teacher;

import java.util.List;

public interface TeacherService{
	Teacher getById(String id);
	Teacher addTeacher(Teacher teacher);
	List<Teacher> getAll();
}
