package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Group{
	@Id
	private String id;
	private String name;
	private Course course;
	private List<Student> students;

	public Group(String name, Course course, List<Student> students){
		this.name = name;
		this.course = course;
		this.students = students;
	}
}
