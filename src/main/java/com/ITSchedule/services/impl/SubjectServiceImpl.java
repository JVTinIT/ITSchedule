package com.ITSchedule.services.impl;

import com.ITSchedule.models.Subject;
import com.ITSchedule.repositories.SubjectRepository;
import com.ITSchedule.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepository;

	public Subject set(Subject subject){
		subjectRepository.save(subject);
		return getById(subject.getId());
	}

	public Subject getById(String id){
		return subjectRepository.getById(id);
	}

	public boolean deleteById(String id) {
		subjectRepository.deleteById(id);
		return subjectRepository.getById(id) == null;
	}

	public List<Subject> getAll(){
		List<Subject> subjects = new ArrayList<>();
		subjects.addAll(subjectRepository.findAll());
		return subjects;
	}
}
