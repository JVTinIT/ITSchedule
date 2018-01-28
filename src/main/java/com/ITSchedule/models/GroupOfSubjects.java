package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document

public class GroupOfSubjects {
	@Id
	private String id;
	private String name;
	private List<Subject> subjects;

	public GroupOfSubjects(String name, List<Subject> subjects){
		this.name = name;
		this.subjects = subjects;
	}
}
