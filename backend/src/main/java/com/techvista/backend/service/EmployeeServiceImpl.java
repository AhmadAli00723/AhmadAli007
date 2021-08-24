package com.techvista.backend.service;

import com.techvista.backend.dao.EmployeeDao;
import com.techvista.backend.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDAO;

    @Transactional
    public Employee create(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAllEmployees(){
        return (List<Employee>) employeeDAO.findAll();
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return employeeDAO.getEmployeeByName(name);
    }
}
