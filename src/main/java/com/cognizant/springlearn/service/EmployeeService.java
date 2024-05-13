package com.cognizant.springlearn.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.Dao.EmployeeDao;



@Component
public class EmployeeService {
    private EmployeeDao employeeDao;

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
        System.out.println("Setter method called for EmployeeDao in EmployeeService");
    }
}