package com.example.demo.service;


import com.example.demo.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);

    void updateStudent(long id, Student student);

    boolean deleteStudent(long id);

    List<Student> getAllStudent();


}
