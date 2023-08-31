package com.java_spring_boot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String dateOfBirth;
    private String address;
    private long phonenumber;
    private String email;
    @ManyToOne
    private Classroom classroom;

    public Student(int id, String name, String dateOfBirth, String address, long phonenumber, String email, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
        this.classroom = classroom;
    }
    public Student(String name, String dateOfBirth, String address, long phonenumber, String email, Classroom classroom) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
        this.classroom = classroom;
    }

    public Student() {
    }
}