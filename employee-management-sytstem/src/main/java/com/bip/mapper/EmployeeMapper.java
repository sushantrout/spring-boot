package com.bip.mapper;

import org.springframework.stereotype.Component;

import com.bip.dto.EmployeeDTO;
import com.bip.entity.Employee;

@Component
public class EmployeeMapper {
	public EmployeeDTO getEmployee(Employee employee) {
		Long id = employee.getId();
		String name = employee.getName();
		Double salary = employee.getSalary();
		Integer age = employee.getAge();
		return new EmployeeDTO(id, name, age, salary);
	}

	public Employee getEmployeeEntity(EmployeeDTO employee) {
		Long id = employee.getId();
		String name = employee.getName();
		Double salary = employee.getSalary();
		Integer age = employee.getAge();
		return new Employee(id, name, age, salary);
	}
}
