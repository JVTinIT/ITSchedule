package com.ITSchedule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ITSchedule.models.Subject;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<Subject,String>{
	Subject getById(String id);
}