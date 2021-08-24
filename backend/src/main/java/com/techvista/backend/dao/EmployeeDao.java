package com.techvista.backend.dao;

import com.techvista.backend.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
        @Query("Select e from Employee e where e.firstName like %:name% or e.lastName like %:name%")
        List<Employee> getEmployeeByName(@Param("name")String name);
}
