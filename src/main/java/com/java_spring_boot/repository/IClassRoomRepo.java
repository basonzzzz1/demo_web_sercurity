package com.java_spring_boot.repository;


import com.java_spring_boot.model.Classroom;
import org.springframework.data.repository.CrudRepository;

public interface IClassRoomRepo extends CrudRepository<Classroom, Integer> {
}
