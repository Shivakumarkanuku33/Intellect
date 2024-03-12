package com.intellect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellect.entity.Employee;
import com.intellect.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public Employee saveEmployee(Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getAllEmployees(){
	   return employeeService.getEmployees();
	}
}
