package com.ITSchedule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ITSchedule.models.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Group,String>{
	Group getById(String id);
}