package com.example.demo.service;

import com.example.demo.model.Clazz;
import com.example.demo.model.Teacher;
import com.example.demo.repository.ClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService implements IClazzService{

    @Autowired
    ClazzRepository clazzRepository;


    @Override
    public void addClazz(Clazz clazz) {
        if (clazz != null){
            clazzRepository.save(clazz);
        }
    }

    @Override
    public void updateClass(String className, Clazz clazz){
        if (clazz != null){
            Clazz clazz1 = clazzRepository.getclazzName(className);
            clazz1.setClazzName(clazz.setClazzName());
            clazz1.setClazzCode(clazz.getClazzCode());
            clazz1.setFacultyName(clazz.getFacultyName());
            clazz1.setTeacherName(clazz.getTeacherName());
        }
    }

    @Override
    public boolean deleteClazz(Clazz clazz){
        if (clazz != null){

            clazzRepository.delete(clazz);
            return true;
        }
        return false;
    }

    @Override
    public List<Clazz> getAllClazz(){
        return clazzRepository.findAll();
    }



}
