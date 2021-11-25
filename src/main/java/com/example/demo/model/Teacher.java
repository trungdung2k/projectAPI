package com.example.demo.model;

import lombok.Data;

@Data
public class Teacher {
    private String name;
    private int age;
    private String gender;
    private String classCode;

    public Teacher() {
    }

    public Teacher(String name, int age, String gender, String classCode) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.classCode = classCode;
    }
}