package com.ITSchedule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ITSchedule.models.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>{
	Student getById(String id);
}