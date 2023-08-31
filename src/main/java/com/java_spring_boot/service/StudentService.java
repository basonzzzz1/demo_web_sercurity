package com.java_spring_boot.service;


import com.java_spring_boot.model.Student;
import com.java_spring_boot.repository.IstudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    IstudentRepo istudentRepo;

   public List<Student> getAll(){
       return (List<Student>) istudentRepo.findAll();
   }
   public Student save(Student student){
  return istudentRepo.save(student);
   }
public void delete(int id){
       istudentRepo.deleteById(id);
}
public Student findById(int id){
       return istudentRepo.findById(id).get();
}
public List<Student> search(String name){
List<Student> studentList = getAll();
List<Student> searchList = new ArrayList<>();
    for (int i = 0; i < studentList.size(); i++) {
        if (studentList.get(i).getName().contains(name)){
            searchList.add(studentList.get(i));
        }
    }
    return searchList;
}
}