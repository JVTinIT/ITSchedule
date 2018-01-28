package com.ITSchedule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Student{
	@Id
	private String id;
	private String name;
	private String surname;
	private Group group;
	private String email;
	private String phoneNumber;
	private Status status;
	private FormOfPayment formOfPayment;

	public Student(String name, String surname, Group group, String email, String phoneNumber, Status status, FormOfPayment formOfPayment){
		this.name = name;
		this.surname = surname;
		this.group = group;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.formOfPayment = formOfPayment;
	}
}
