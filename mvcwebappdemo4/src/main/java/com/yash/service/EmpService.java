package com.yash.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.yash.model.Employee;


@Service
public interface EmpService extends JpaRepository<Employee, Integer> {
	
}
