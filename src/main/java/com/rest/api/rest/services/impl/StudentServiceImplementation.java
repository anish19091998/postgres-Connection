package com.rest.api.rest.services.impl;

import com.rest.api.rest.entities.Student;
import com.rest.api.rest.repositories.StudentRepository;
import com.rest.api.rest.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentServiceImplementation implements StudentServices {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student getStudent(String rollno) {

     return studentRepository.findById(rollno).get();

    }

    @Override
    public Student saveStudent(Student student) {

        studentRepository.save(student);
        return student;
    }


}
