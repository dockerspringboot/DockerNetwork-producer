package com.springboot.docker.network.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.docker.network.model.Employee;
import com.springboot.docker.network.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return this.employeeService.getEmployee(id);
	} 
}
