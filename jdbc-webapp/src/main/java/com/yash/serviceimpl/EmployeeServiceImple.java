package com.yash.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.DBConnection;
import com.yash.model.Employee;
import com.yash.mvcwebappdemo2.service.EmpService;

@Service
public class EmployeeServiceImple implements EmpService<Employee> {

	@Autowired
	DBConnection dbcon;

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee>e=new ArrayList<Employee>();
		return e;
	}

	@Override
	public List<Employee> getAllEmpName() {
		String s=new String();
		return null;
	}

}
