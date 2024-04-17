package com.rest.api.rest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private String  rollno;
    private String name;

    public void  checkName(String name){

        if(name.length()<10){
            throw new RuntimeException("name is not valid");
        }

    }
}
