package com.example.demo.service;

import com.example.demo.model.Faculty;
import com.example.demo.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacultyService implements IFacultyService{
    @Autowired
    FacultyRepository facultyRepository;

    @Override
    public Faculty addFaculty(Faculty faculty){
        if (faculty != null){
            return facultyRepository.save(faculty);
        }
        return null;
}

    @Override
    public void updateFaculty(String name, Faculty faculty){
        if (faculty != null){
            Faculty faculty1 = facultyRepository.getName(name);
            faculty1.setFacultyName(faculty.getFacultyName());
            faculty1.setFacultyCode(faculty.getFacultyCode());
        }
    }

    @Override
    public boolean deleteFaculty(Faculty faculty){
        if (faculty != null){

            facultyRepository.delete(faculty);
            return true;
        }
        return false;
    }

    @Override
    public List<Faculty> getAllFaculty(){
        return facultyRepository.findAll();
    }
}
