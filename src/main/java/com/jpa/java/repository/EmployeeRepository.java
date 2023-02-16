package com.jpa.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.java.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
