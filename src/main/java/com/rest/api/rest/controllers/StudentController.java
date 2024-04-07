package com.rest.api.rest.controllers;

import com.rest.api.rest.entities.Student;
import com.rest.api.rest.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin("*")
public class StudentController {

    @Autowired
    StudentServices studentServices;



    @GetMapping("v1/student")
    public Student getStudent(@RequestParam String rollno){

        return studentServices.getStudent(rollno);



    }
    @PostMapping("v1/student")
    public Student saveStudent(@RequestBody Student student){
        return studentServices.saveStudent(student);

    }
}
