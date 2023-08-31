package com.java_spring_boot.repository;

import com.java_spring_boot.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IstudentRepo extends CrudRepository<Student, Integer> {
   Student findAllByName(String name);
}
