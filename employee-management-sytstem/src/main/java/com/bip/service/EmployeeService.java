package com.bip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bip.entity.Employee;
import com.bip.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}

	public Employee createEmployee(Employee entity) {
		return employeeRepo.save(entity);
	}
}
