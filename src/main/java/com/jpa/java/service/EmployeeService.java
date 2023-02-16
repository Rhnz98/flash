package com.jpa.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.java.model.Employee;
@Service
public interface EmployeeService {

	 Employee saveEmployee(Employee employee);
	 List<Employee>getAll();
}
