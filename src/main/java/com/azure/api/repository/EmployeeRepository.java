package com.azure.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azure.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
