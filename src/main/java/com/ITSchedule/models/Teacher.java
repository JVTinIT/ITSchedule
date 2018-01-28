package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.*;

@Data
@AllArgsConstructor
@Document(collection = "teacher")
public class Teacher{

	@Id
	private String id;

	private String name;
	private String surname;
	private String email;
	private String password;
	private String phone;

	@DBRef
	private List<Subject> subjectList;
	private Map<Days,List<Integer>> workTimeOptions=new HashMap<>();

	public void setWorkTimeOptions(Days day, Integer lesson) {
		List<Integer> lessonsList;
		if(workTimeOptions.containsKey(day)){
			lessonsList=workTimeOptions.get(day);
			if(lessonsList.contains(lesson)){
				lessonsList.remove(lesson);
			}else{
				lessonsList.add(lesson);
			}
			this.workTimeOptions.put(day, lessonsList);
		}else{
			lessonsList = new ArrayList<>();
			lessonsList.add(lesson);
			getWorkTimeOptions().put(day,lessonsList);
		}
	}

	public Teacher(){};

}

