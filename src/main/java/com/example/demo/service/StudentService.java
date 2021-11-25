package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student){
        if (student != null){
            return studentRepository.save(student);
        }
        return  null ;
    }

    @Override
    public void updateStudent(long id, Student student){
        if (student != null){
            Student student1 = studentRepository.getById(id);
            student1.setName(student.getName());
            student1.setAge(student.getAge());
            student1.setAddress(student.getAddress());
            student1.setClassCode(student.getClassCode());
            student1.setGender(student.getGender());
            student1.setPhone(student.getPhone());
            student1.setMsv(student.getMsv());
            studentRepository.save(student);
        }
    }

    @Override
    public boolean deleteStudent(long id){
        if (id > 0 ){
            Student student = studentRepository.getById(id);
            studentRepository.delete(student);
            return true;
        }
        return false;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }


}
