package com.ITSchedule.controllers;

import com.ITSchedule.models.Subject;
import com.ITSchedule.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController{

    @Autowired
    private SubjectService subjectService;

    @PostMapping(value = "/new", consumes = "application/json")
    public Subject addOrEdit(@RequestBody Subject subject) {
        return subjectService.set(subject);
    }

    @GetMapping("/{id}")
    public Subject getById(@PathVariable String id) {
        return subjectService.getById(id);
    }

    @GetMapping("/all")
    public List<Subject> getAll() {
        return subjectService.getAll();
    }

    @DeleteMapping("/del/{id}")
    public boolean delete(@PathVariable String id) {
        return subjectService.deleteById(id);
    }
}
