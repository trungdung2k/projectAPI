package com.example.demo.repository;

import com.example.demo.model.Clazz;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClazzRepository {
    void save(Clazz clazz);
    Clazz getclazzName(String className);

    void delete(Clazz clazz);

    List<Clazz> findAll();
}
