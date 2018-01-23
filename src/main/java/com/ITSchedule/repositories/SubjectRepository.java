package com.ITSchedule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ITSchedule.models.Subject;

public interface SubjectRepository extends MongoRepository<Subject,String>{
}
