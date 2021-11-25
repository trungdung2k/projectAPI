package com.example.demo.service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService{
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Teacher addTeacher(Teacher teacher){
        if (teacher != null){
            return teacherRepository.save(teacher);
        }
        return null;
    }

    @Override
    public void updateTeacher(String name, Teacher teacher){
        if (teacher != null){
            Teacher teacher1 = teacherRepository.getName(name);
            teacher1.setName(teacher.getName());
            teacher1.setAge(teacher.getAge());
            teacher1.setGender(teacher.getGender());
            teacher1.setClassCode(teacher.getClassCode());
        }
    }

    @Override
    public boolean deleteStudent(Teacher teacher ){
        if (teacher != null){

            teacherRepository.delete(teacher);
            return true;
        }
        return false;
    }

    @Override
    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }
}
