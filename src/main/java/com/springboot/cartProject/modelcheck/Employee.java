package com.springboot.cartProject.modelcheck;

import lombok.Data;

@Data
public class Employee {

    private Long id;


    private String name;
    private double salary;
    private String  gmail;
    private boolean present;
    private int noOfSkills;

}
