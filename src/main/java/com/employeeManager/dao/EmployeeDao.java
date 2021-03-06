package com.employeeManager.dao;

import com.employeeManager.model.Employee;

import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void removeEmployee(int id);

    Employee getEmployeeById(int id);

    List<Employee> listEmployees();

}
