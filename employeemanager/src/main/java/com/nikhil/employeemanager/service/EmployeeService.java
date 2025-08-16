package com.nikhil.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.employeemanager.repo.EmployeeRepo;


@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo ; 

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    
}
