package com.ITSchedule.services;

import com.ITSchedule.models.Subject;

import java.util.List;

public interface SubjectService{
	Subject set(Subject subject);
	Subject getById(String id);
	boolean deleteById(String id);
	List<Subject> getAll();
}
