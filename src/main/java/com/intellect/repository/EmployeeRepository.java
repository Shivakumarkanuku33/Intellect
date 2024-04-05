package com.intellect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intellect.entity.Employee;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

	public Employee  getEmployeeById(int id);

	public Employee updateEmployee(Employee employee);

}
