package com.example.demo.controller;


import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private  StudentService studentService;
//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = (StudentService) studentService;
//    }

    @GetMapping(value = "/student/add")
    public Student getStudent(){
        return null;
//        return studentService.addStudent(student);
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/update")
    public void updateStudent (@RequestParam("id") long id , @RequestBody Student student){
       studentService.updateStudent(id , student);
    }

    @DeleteMapping("/delete")
    public boolean deleteStudent(@PathVariable long id ){
        return  studentService.deleteStudent(id);
    }


    @GetMapping("/list")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


}
