package com.exc.service;

public class Student {
    private String studentId;
    private String name;
    private String grade;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void display() {
        System.out.println(studentId + " | " + name + " | " + grade);
    }
}
