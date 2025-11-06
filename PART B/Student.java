package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String city;

    public Student() {}

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Getters, Setters, toString()
}
