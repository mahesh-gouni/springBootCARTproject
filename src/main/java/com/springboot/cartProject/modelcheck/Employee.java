package com.springboot.cartProject.modelcheck;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {

    private Long EmployeeID;
    private String name;
    private int Age;
    private int DepartmentID;
    private Date date;
    private double Salary;
    private String  Location;
    private String  gmail;
    private int forkey_dep;


}
