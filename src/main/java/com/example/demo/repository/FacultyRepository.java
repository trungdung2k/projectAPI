package com.example.demo.repository;

import com.example.demo.model.Faculty;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyRepository {
    Faculty getName(String name);

    void delete(Faculty faculty);

    List<Faculty> findAll();

    Faculty save(Faculty faculty);
}
