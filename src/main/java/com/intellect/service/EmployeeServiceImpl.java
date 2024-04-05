package com.intellect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellect.entity.Employee;
import com.intellect.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepository.getEmployeeById(id);
		 
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		return null;
	}

}
