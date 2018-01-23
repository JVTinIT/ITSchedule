package com.ITSchedule.controllers;


import com.ITSchedule.models.Subject;
import com.ITSchedule.services.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController{

    @Autowired
    private SubjectsService subjectsService;

    @GetMapping("/all")
    public List<Subject> getAll() {
        return subjectsService.showAll();
    }

    @RequestMapping(value = "/add",
                    method = RequestMethod.POST,
                    consumes = "application/json")
    public Subject add(@RequestBody Subject subject) {
        return subjectsService.addSubject(subject);
    }

}