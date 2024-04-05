package com.intellect.service;

import java.util.List;

import com.intellect.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getEmployees();
	
	public Employee getEmployeeById(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public String deleteEmployee(Integer id);
}
