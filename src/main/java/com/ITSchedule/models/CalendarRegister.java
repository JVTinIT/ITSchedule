package com.ITSchedule.models;

import java.util.Date;

public class CalendarRegister{
	private Date date;
	private Subject subject;
	private int numberLesson;
	private Group group;
	private Teacher teacher;

	public CalendarRegister(Date date, Subject subject, int numberLesson, Group group, Teacher teacher){
		this.date = date;
		this.subject = subject;
		this.numberLesson = numberLesson;
		this.group = group;
		this.teacher = teacher;
	}
}
