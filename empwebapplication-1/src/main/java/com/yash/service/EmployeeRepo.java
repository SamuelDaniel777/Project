package com.yash.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
