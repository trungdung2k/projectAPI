package com.example.demo.service;

import com.example.demo.model.Teacher;

import java.util.List;

public interface ITeacherService {
    Teacher addTeacher(Teacher teacher);

    void updateTeacher(String name, Teacher teacher);

    boolean deleteStudent(Teacher teacher);

    List<Teacher> getAllTeacher();
}
