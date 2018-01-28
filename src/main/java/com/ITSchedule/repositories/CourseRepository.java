package com.ITSchedule.repositories;

import com.ITSchedule.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course,String>{
	Course getById(String id);
}
