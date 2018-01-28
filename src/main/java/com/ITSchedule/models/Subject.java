package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Subject{
	@Id
	private String id;
	private String name;
	private int numberOfLessons;
	private List<Teacher> teachers;
	private TypeOfSubject typeOfSubject;

	public Subject(String name, int numberOfLessons, List<Teacher> teachers, TypeOfSubject typeOfSubject){
		this.name = name;
		this.numberOfLessons = numberOfLessons;
		this.teachers = teachers;
		this.typeOfSubject = typeOfSubject;
	}
}
