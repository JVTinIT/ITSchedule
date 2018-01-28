package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "disciplines")
public class Discipline{
	@Id
	private String id;

	private String name;

	@DBRef
	private List<Subject> subjects;

	public Discipline(){};

}
