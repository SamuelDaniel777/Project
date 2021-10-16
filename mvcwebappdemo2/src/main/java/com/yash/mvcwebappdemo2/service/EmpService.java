package com.yash.mvcwebappdemo2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.model.Employee;


@Service
public interface EmpService<T> {
	List<Employee> getAllEmployee();
	List<Employee> getAllEmpName();
}
