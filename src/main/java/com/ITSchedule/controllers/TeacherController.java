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

    @PostMapping(value = "/save", consumes = "application/json")
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @GetMapping("/{id}")
    public Teacher getOne(@PathVariable String id) {
        return teacherService.getById(id);
    }

    @DeleteMapping("/del/{id}")
    public boolean delete(@PathVariable String id) {
        return teacherService.deleteById(id);
    }

    @GetMapping("/all")
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }



}
