package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "groups")
public class Group{
	@Id
	private String id;

	private String name;
	private Course course;

	@DBRef
	private List<Student> students;

	public Group(){};

}
