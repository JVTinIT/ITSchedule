package com.ITSchedule.controllers;


import com.ITSchedule.models.Teacher;
import com.ITSchedule.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController{

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getOne(@PathVariable String id) {
        return teacherService.getById(id);
    }

    @GetMapping("/all")
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @RequestMapping(value = "/new",
                    method = RequestMethod.POST,
                    consumes = "application/json")
    public Teacher add(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

}