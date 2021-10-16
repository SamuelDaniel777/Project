package com.yash.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.exception.InvalidDataException;
import com.yash.model.Employee;
import com.yash.service.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo er;
	
	public Boolean saveEmp(Employee emp) throws InvalidDataException   {
		if (emp!=null) 
		{
			System.out.println("save calledd usin sysout");
			er.save(emp);
			System.out.println("called");
			Boolean b= true;
			return b;
		} 	
		
		else
		{
			throw new InvalidDataException("Invalid Data Entry");
		}

	}
}
