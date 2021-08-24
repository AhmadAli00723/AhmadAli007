package com.techvista.backend.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@NamedQuery(name="find_all_employees",query = "select e from Employee e")
@Table(name="EMPLOYEES")
public class Employee {
    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EMPLOYEE_ID",unique=true,nullable=false)
    private Integer employeeId;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL")
    private String email;
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;
    @Column(name="HIRE_DATE")
    private Date hireDate;
    @Column(name="SALARY")
    private Double salary;
    @Column(name="MANAGER_ID")
    private Integer managerId;
    @Column(name="DEPARTMENT_ID")
    private Integer departmentId;

    public Employee(Integer employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate, Double salary, Integer managerId, Integer departmentId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.salary = salary;
        this.managerId = managerId;
        this.departmentId = departmentId;
    }

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Double salary, Integer managerId, Integer departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.salary = salary;
        this.managerId = managerId;
        this.departmentId = departmentId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(phoneNumber, employee.phoneNumber) &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(managerId, employee.managerId) &&
                Objects.equals(departmentId, employee.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, email, phoneNumber, hireDate, salary, managerId, departmentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", managerId=" + managerId +
                ", departmentId=" + departmentId +
                '}';
    }
}
