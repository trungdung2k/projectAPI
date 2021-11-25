package com.example.demo.controller;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
//    public TeacherController(ITeacherService teacherService) {
//        this.teacherService = (TeacherService) teacherService;
//    }


    @PostMapping("/add")
    public void addTeacher(@RequestBody Teacher teacher){
         teacherService.addTeacher(teacher);
    }

    @PutMapping("/update")
    public void updateTeacher (@RequestParam("name") String name , @RequestBody Teacher teacher){
        teacherService.updateTeacher(name , teacher);
    }

    @DeleteMapping("/delete")
    public boolean deleteTeacher(@PathVariable Teacher name ){
        return  teacherService.deleteStudent(name);
    }


    @GetMapping("/list")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }

}
