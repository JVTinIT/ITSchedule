package com.ITSchedule.repositories;

import com.ITSchedule.models.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String>{
    Teacher getById(String id);

//	boolean saveAll(List<Teacher> teachers);
}
