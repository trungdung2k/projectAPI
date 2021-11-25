package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String gender;
    private int age;
    private String msv;
    private String address;
    private int phone;
    private String classCode;

    public Student() {
    }

    public Student(long id, String name, String gender, int age, String msv, String address, int phone, String classCode) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.msv = msv;
        this.address = address;
        this.phone = phone;
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", msv='" + msv + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", classCode='" + classCode + '\'' +
                '}';
    }
}

