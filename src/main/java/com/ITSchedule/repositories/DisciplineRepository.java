package com.ITSchedule.repositories;

import com.ITSchedule.models.Discipline;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DisciplineRepository extends MongoRepository<Discipline,String>{
	Discipline getById(String id);
}
