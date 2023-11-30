package com.azure.api.service;

import java.util.List;

import com.azure.api.model.Employee;

public interface IEmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
