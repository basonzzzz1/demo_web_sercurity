package com.java_spring_boot.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @ManyToOne
    private Role role;

}