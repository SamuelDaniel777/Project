package com.yash.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
	
	public List<Employee> getAllEmployee() throws SQLException {
		Connection con= dbcon.getConnection();
		PreparedStatement pstm= con.prepareStatement("SELECT * from emp_data");
		ResultSet rs= pstm.executeQuery();
		List<Employee>empList=new ArrayList<Employee>();
		while(rs.next()) {  
			Employee emp=new Employee();
		    emp.setEmpId(rs.getInt(1));
			emp.setEmail(rs.getString(2));
			emp.setEmpName(rs.getString(3));
			emp.setEmpPhone(rs.getString(4));
			emp.setGender(rs.getString(5));
			emp.setPassowrd(rs.getString(6));
			empList.add(emp);
		}
		return empList;
	}

	public List<Employee> getAllEmpName() {
		String s=new String();
		return null;
	}

}
