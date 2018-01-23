package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document
public class Course{
	private String name;
	private List<Discipline> listDiscipline;
	private String startDate;
	private String endDate;
}
