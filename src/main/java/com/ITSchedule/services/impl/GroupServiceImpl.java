package com.ITSchedule.services.impl;

import com.ITSchedule.models.Group;
import com.ITSchedule.repositories.GroupRepository;
import com.ITSchedule.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	private GroupRepository groupRepository;

	public Group getById(String id) {
		return groupRepository.getById(id);
	}

	public Group set(Group group) {
		groupRepository.save(group);
		return getById(group.getId());
	}

	public boolean deleteById(String id) {
		groupRepository.deleteById(id);
		return groupRepository.getById(id)==null;
	}

	public List<Group> getAll() {
		List<Group> groupList = new ArrayList<>();
		groupList.addAll(groupRepository.findAll());
		return groupList;
	}

}
