package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection = "calendar")
public class CalendarRegister{
	private Date date;
	private Subject subject;
	private int numberLesson;
	private Group group;
	private Teacher teacher;

	public CalendarRegister(){};

}
