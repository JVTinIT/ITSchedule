package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Student{
	@Id
	private String id;

	private String email;
	private String name;
	private String surname;
	private Group group;
}
