package com.techvista.backend.controller;


import com.techvista.backend.entities.Employee;
import com.techvista.backend.dto.EmployeeDto;
import com.techvista.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);

    }
    @PostMapping("/createemployee")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = mapEmployee(employeeDto);
        employeeService.create(employee);
        return new ResponseEntity<>("Employee created successfully", HttpStatus.OK);
    }
    @GetMapping("/employeebyname")
    public ResponseEntity<List<Employee>> getAllEmployeesByName(@RequestParam("name")String name){
        return new ResponseEntity<>(employeeService.getEmployeeByName(name), HttpStatus.OK);

    }

    public Employee mapEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        employee.setPhoneNumber(employeeDto.getPhoneNumber());
        employee.setHireDate(employeeDto.getHireDate());
        employee.setSalary(employeeDto.getSalary());
        employee.setManagerId(employeeDto.getManagerId());
        employee.setDepartmentId(employeeDto.getDepartmentId());
        return employee;

    }

}
