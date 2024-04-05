package com.intellect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intellect.entity.Employee;
import com.intellect.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {

		String str = "Employee Record Saved Successfully";
		 employeeService.saveEmployee(employee);
		 return new ResponseEntity<>(str,HttpStatus.CREATED);
	}

	@GetMapping("/getEmployee")
	public List<Employee> getAllEmployees(){
	   return employeeService.getEmployees();
	}
	
	@GetMapping("/getEmployee/id")
	public Employee getEmployeeById(@PathVariable("id") int id){
	   return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
		String str = "Employee Record Updated Successfully";
		employeeService.updateEmployee(employee);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmployee/id")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
		String str = "Employee Record Deleted";
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String> (str, HttpStatus.OK);
		
	}
}
