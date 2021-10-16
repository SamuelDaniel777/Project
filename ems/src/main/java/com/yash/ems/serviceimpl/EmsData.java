package com.yash.ems.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.ems.model.EmployeeData;
import com.yash.ems.util.JDBCUtil;

public class EmsData {
	
	public static void insertData(int id,String name,double salary) throws ClassNotFoundException, SQLException {
		EmployeeData ed = new EmployeeData(id,name,salary);
		Connection con=JDBCUtil.psDemo();
		PreparedStatement pstmt=con.prepareStatement("insert into employee(id,name,salary) values(?,?,?)");  
		System.out.println(ed.getName());
		pstmt.setInt(1, ed.getId());
		pstmt.setString(2, ed.getName());
		pstmt.setDouble(3, ed.getSalary());
		pstmt.executeUpdate();
		
		System.out.println("done");
	}

}
