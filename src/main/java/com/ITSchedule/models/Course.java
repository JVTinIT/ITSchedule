package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "courses")
public class Course{
	@Id
	private String id;

	private String name;

	@DBRef
	private List<Discipline> listDiscipline;
	private Date startDate;
	private Date endDate;

	public Course(){};
}
