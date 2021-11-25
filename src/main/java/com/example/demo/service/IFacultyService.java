package com.example.demo.service;

import com.example.demo.model.Faculty;

import java.util.List;

public interface IFacultyService {
    Faculty addFaculty(Faculty faculty);

    void updateFaculty(String name, Faculty faculty);

    boolean deleteFaculty(Faculty faculty);

    List<Faculty> getAllFaculty();
}
