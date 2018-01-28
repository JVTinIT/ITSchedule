package com.ITSchedule.services.impl;

import com.ITSchedule.models.Discipline;
import com.ITSchedule.repositories.DisciplineRepository;
import com.ITSchedule.services.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService{

	@Autowired
	private DisciplineRepository disciplineRepository;

	public Discipline set(Discipline discipline){
		disciplineRepository.save(discipline);
		return getById(discipline.getId());
	}

	public Discipline getById(String id){
		return disciplineRepository.getById(id);
	}

	public boolean deleteById(String id) {
		disciplineRepository.deleteById(id);
		return disciplineRepository.getById(id) == null;
	}

	public List<Discipline> getAll(){
		List<Discipline> disciplines = new ArrayList<>();
		disciplines.addAll(disciplineRepository.findAll());
		return disciplines;
	}
}
