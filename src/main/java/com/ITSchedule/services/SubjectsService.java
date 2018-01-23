package com.ITSchedule.services;

import com.ITSchedule.models.Subject;

import java.util.List;

public interface SubjectsService{
	Subject addSubject(Subject subject);
	List<Subject> showAll();
}
