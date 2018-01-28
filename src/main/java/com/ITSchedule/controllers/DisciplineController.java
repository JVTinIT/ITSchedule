package com.ITSchedule.controllers;

import com.ITSchedule.models.Discipline;
import com.ITSchedule.services.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discipline")
public class DisciplineController{

	@Autowired
	private DisciplineService disciplineService;

	@PostMapping(value = "/new", consumes = "application/json")
	public Discipline addOrEdit(@RequestBody Discipline discipline) {
		return disciplineService.set(discipline);
	}

	@GetMapping("/{id}")
	public Discipline getById(@PathVariable String id) {
		return disciplineService.getById(id);
	}

	@GetMapping("/all")
	public List<Discipline> getAll() {
		return disciplineService.getAll();
	}

	@DeleteMapping("/del/{id}")
	public boolean delete(@PathVariable String id) {
		return disciplineService.deleteById(id);
	}

}
