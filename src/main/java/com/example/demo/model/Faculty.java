package com.example.demo.model;

import lombok.Data;

@Data
public class Faculty {
    private String facultyName;
    private String facultyCode;

    public Faculty(){

    }

    public Faculty(String facultyName, String facultyCode) {
        this.facultyName = facultyName;
        this.facultyCode = facultyCode;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", facultyCode='" + facultyCode + '\'' +
                '}';
    }
}
