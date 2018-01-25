package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document
public class Course{
	@Id
	private String id;
	private String name;
	private List<GroupOfSubjects> listDiscipline;
	private String startDate;
	private String endDate;
}
