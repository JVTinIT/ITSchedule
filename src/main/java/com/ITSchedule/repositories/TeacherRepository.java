package com.ITSchedule.repositories;

import com.ITSchedule.models.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, String>{

    Teacher getById(String id);
}
