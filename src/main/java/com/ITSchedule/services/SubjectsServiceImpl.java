package com.ITSchedule.services;

import com.ITSchedule.models.Subject;
import com.ITSchedule.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectsServiceImpl implements SubjectsService{

	@Autowired
	private SubjectRepository subjectRepository;

	public Subject addSubject(Subject subject){
		return subjectRepository.save(subject);
	}

	public List<Subject> showAll(){
		List<Subject> subjects = new ArrayList<>();
		subjects.addAll(subjectRepository.findAll());
		return subjects;
	}




}
