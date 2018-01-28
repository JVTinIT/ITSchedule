package com.ITSchedule.services;

import com.ITSchedule.models.Discipline;

import java.util.List;

public interface DisciplineService{
	Discipline set(Discipline discipline);
	Discipline getById(String id);
	boolean deleteById(String id);
	List<Discipline> getAll();
	
}
