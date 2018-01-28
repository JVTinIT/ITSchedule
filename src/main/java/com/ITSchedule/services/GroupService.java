package com.ITSchedule.services;

import com.ITSchedule.models.Group;

import java.util.List;

public interface GroupService{
	Group set(Group group);
	Group getById(String id);
	boolean deleteById(String id);
	List<Group> getAll();
}
