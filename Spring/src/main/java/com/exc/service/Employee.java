package com.exc.service;


public class Employee {
    private String name;
    private String position;
    private Department department;

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayEmployee() {
        System.out.println(name + " | " + position + " | " + department);
    }
}
