package com.intellect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intellect.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
