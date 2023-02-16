package com.jpa.java.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.java.model.Employee;
import com.jpa.java.repository.EmployeeRepository;
import com.jpa.java.service.EmployeeService;
@Service
public class EmployeeServiceimpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAll() {
		
		return employeeRepository.findAll();
	}

}
