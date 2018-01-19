package com.ITSchedule.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Teacher{

	@Id
	private String id;

	private String email;
	private String password;
	private String name;
	private String surname;
	private String phone;
	private boolean[][] workTimeOptions = new boolean[7][7];    //7dayOfWeek*7lessons
	private List<String> subjects = new ArrayList<>();

	public void setWorkTimeOptions(int lesson, int day) {
		this.workTimeOptions[lesson][day]=!workTimeOptions[lesson][day];
	}
}