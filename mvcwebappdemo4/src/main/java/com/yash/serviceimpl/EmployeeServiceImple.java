package com.yash.serviceimpl;


import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Employee;
import com.yash.service.EmpService;

@Service
public class EmployeeServiceImple  {
	
	@Autowired
	EmpService es;
	
	public List<Employee> getAllEmployee() throws SQLException {
		try {
			List<Employee>e= es.findAll();
			return e;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Employee> getAllEmpName() {
		String s=new String();
		return null;
	}

}
