package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.DayOfWeek;
import java.util.*;

@Data
@AllArgsConstructor
@Document
public class Teacher{

	@Id
	private String id;

	private String email;
	private String name;
	private String surname;
	private String password;
	private String phone;
	private List<Subject> subjectList;
	private Map<DayOfWeek, int[]> schedule;
}
