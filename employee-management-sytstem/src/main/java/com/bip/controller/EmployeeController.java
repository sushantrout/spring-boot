package com.bip.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bip.dto.EmployeeDTO;
import com.bip.dto.ResponseList;
import com.bip.entity.Employee;
import com.bip.mapper.EmployeeMapper;
import com.bip.service.EmployeeService;

@RestController
@RequestMapping(value = "api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeMapper mapper;
	
	@GetMapping
	public ResponseEntity<ResponseList<EmployeeDTO>> getEmployees() {
		List<Employee> employees = employeeService.getEmployee();
		List<EmployeeDTO> infoList = employees.stream().map(e -> mapper.getEmployee(e)).collect(Collectors.toList());
		ResponseList<EmployeeDTO> list = new ResponseList<>();
		list.setInfoList(infoList);
		ResponseEntity<ResponseList<EmployeeDTO>> ok = ResponseEntity.ok(list);
		return ok;
	}

	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		Employee employeReq = mapper.getEmployeeEntity(employeeDTO);
		Employee employee = employeeService.createEmployee(employeReq);
		ResponseEntity<Employee> ok = ResponseEntity.ok(employee);
		return ok;
	}
}
