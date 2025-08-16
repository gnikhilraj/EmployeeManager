package com.nikhil.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
