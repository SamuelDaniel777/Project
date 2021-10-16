package com.yash.mvcwebappdemo2.daoimpl;

import java.sql.Connection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.yash.dao.DBConnection;
import com.yash.dao.EmpDaoInterface;
import com.yash.model.Employee;

@Repository
public class EmployeeDao implements EmpDaoInterface<Employee> {
	
	@Autowired
	private DBConnection dbCon;
	 
	@Override
	public boolean saveData(Employee ob) {
		try {
			Connection con= dbCon.getConnection();
			con.prepareStatement("");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}
	
	@Override
	public boolean updateData(Employee ob) {
		try {
			
		
			return true;
			
		} catch (Exception e) {
			System.err.println("failed updation");
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean deleteData(Employee ob) {
		
		try {
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Employee get(int id) {
		Employee emp=new Employee();
		return emp;
		
	}

}
