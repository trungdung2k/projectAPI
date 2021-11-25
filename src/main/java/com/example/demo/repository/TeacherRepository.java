package com.example.demo.repository;

import com.example.demo.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository {
    Teacher save(Teacher teacher);

    Teacher getName(String name);

    void delete(Teacher teacher);

    List<Teacher> findAll();
}
