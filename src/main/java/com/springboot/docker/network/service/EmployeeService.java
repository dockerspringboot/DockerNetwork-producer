package com.springboot.docker.network.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.docker.network.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmployee(Integer id) {
		return this.getEmp(id);
	}
	
	private Employee getEmp(int empid){
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Adam");
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Eve");
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		
		return employeeList.get(empid - 1);
	}
}

