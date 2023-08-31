package com.java_spring_boot.service;


import com.java_spring_boot.model.Classroom;
import com.java_spring_boot.repository.IClassRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {
@Autowired
IClassRoomRepo iClassRoomRepo;

public List<Classroom> getAll(){
    return (List<Classroom>) iClassRoomRepo.findAll();
}
}