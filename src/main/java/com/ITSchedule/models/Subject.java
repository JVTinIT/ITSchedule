package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "subject")
public class Subject implements Serializable{
	@Id
	private String id;

	private String name;
	private int numberOf;

	@DBRef
	private List<Teacher> teachers;

	public Subject(){};
}
