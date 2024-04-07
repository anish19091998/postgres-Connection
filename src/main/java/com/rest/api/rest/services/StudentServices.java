package com.rest.api.rest.services;

import com.rest.api.rest.entities.Student;

import java.util.List;

public interface StudentServices {

    Student getStudent(String rollno);
    Student saveStudent(Student student);
}
