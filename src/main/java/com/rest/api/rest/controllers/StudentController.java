package com.rest.api.rest.controllers;

import com.rest.api.rest.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class StudentController {

    List<Student> studentList=new ArrayList<>();

    @GetMapping("v1/student")
    public Student getStudent(@RequestParam String rollno){
        Student student= new Student();

        studentList.forEach(e -> {
            if(e.getRollno().equalsIgnoreCase(rollno)){
               student.setName(e.getName());
               student.setRollno(e.getRollno());

            }
        });
        if (student != null) {
        return student;
        }
        return student;


    }
    @PostMapping("v1/student")
    public List<Student> saveStudent(@RequestBody Student student){


        studentList.add(student);
        return studentList;
    }
}
