package com.techvista.backend.service;

import com.techvista.backend.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee create(Employee employee);
    public List<Employee> getAllEmployees();
    List<Employee> getEmployeeByName(String name);
}
