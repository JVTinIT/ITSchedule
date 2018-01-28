package com.ITSchedule.services.impl;

import com.ITSchedule.models.Teacher;
import com.ITSchedule.repositories.TeacherRepository;
import com.ITSchedule.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;

	public Teacher getById(String id) {
		return teacherRepository.getById(id);
	}

	public Teacher save(Teacher teacher) {
		teacherRepository.save(teacher);
		return getById(teacher.getId());
	}

	public boolean deleteById(String id) {
		teacherRepository.deleteById(id);
		return teacherRepository.getById(id)==null;
	}

	public List<Teacher> getAll() {
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.addAll(teacherRepository.findAll());
		return teacherList;
	}

}
