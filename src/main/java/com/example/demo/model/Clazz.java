package com.example.demo.model;
import lombok.Data;

@Data
public class Clazz {
    private String clazzCode;
    private String clazzName;
    private String facultyName;
    private String teacherName;

    public Clazz(){

    }

    public Clazz(String clazzCode, String clazzName, String facultyName, String teacherName) {
        this.clazzCode = clazzCode;
        this.clazzName = clazzName;
        this.facultyName = facultyName;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "classCode='" + clazzCode + '\'' +
                ", className='" + clazzName + '\'' +
                ", faculty='" + facultyName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public String setClazzName() {
        return null;
    }
}
