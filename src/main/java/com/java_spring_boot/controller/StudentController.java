package com.java_spring_boot.controller;


import com.java_spring_boot.model.Classroom;
import com.java_spring_boot.model.Student;
import com.java_spring_boot.service.ClassRoomService;
import com.java_spring_boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    ClassRoomService classRoomService;
    @GetMapping("/classRoom")
    public List<Classroom> getClassRoom(){
        return classRoomService.getAll();
    }
    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }
@GetMapping("/search")
    public List<Student> search(String name){
        return studentService.search(name);
}
    @GetMapping("/{id}")
    public Student getAccount(@PathVariable int id){
        return studentService.findById(id);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        return new ResponseEntity<>(studentService.save(new Student(student.getId() , student.getName() ,student.getDateOfBirth() , student.getAddress() , student.getPhonenumber(),student.getEmail() , student.getClassroom() )), HttpStatus.OK);
    }
}