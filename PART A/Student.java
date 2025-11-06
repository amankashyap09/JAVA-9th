package com.example;

public class Student {
    private String name;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
    }
}
