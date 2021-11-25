package com.example.demo.service;

import com.example.demo.model.Clazz;

import java.util.List;

public interface IClazzService {
    void addClazz (Clazz clazz);


    void updateClass(String className, Clazz clazz);

    boolean deleteClazz(Clazz clazz);

    List<Clazz> getAllClazz();
}
