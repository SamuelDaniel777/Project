package com.yash.mvcwebappdemo2.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.yash.dao.EmpDaoInterface;
import com.yash.model.Employee;

@Repository
public class EmployeeDao implements EmpDaoInterface<Employee> {
	
	private JdbcTemplate jdbcTemplate=new JdbcTemplate();
		
	public EmployeeDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean saveData(Employee ob) {
		try {
			
			jdbcTemplate.update("insert into emp_data(emp_id,emp_email,emp_name,emp_phone,emp_gender,emp_passowrd)"
					+ "values(?,?,?,?,?,?)");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}
	
	public boolean updateData(Employee ob) {
		try {
			Connection con= dbCon.getConnection();
			PreparedStatement pstmt=con.prepareStatement("update emp_data set emp_email=?, emp_name=?, emp_phone=?, emp_gender=?, emp_passowrd=? where emp_id=?");
			pstmt.setString(1, ob.getEmail());
			pstmt.setString(2, ob.getEmpName());
			pstmt.setString(3, ob.getEmpPhone());
			pstmt.setString(4, ob.getGender());
			pstmt.setString(5, ob.getPassowrd());
			pstmt.setInt(6, ob.getEmpId());
			
			pstmt.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.err.println("failed updation");
			e.printStackTrace();
			return false;
		}
		
	}

	
	public boolean deleteData(Employee ob) {
		
		try {
			
			PreparedStatement pstmt=con.prepareStatement("delete from emp_data where emp_id=?");
			pstmt.setInt(1, ob.getEmpId());
			pstmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	
	public Employee get(int id) {
		
		try {
			Connection con= dbCon.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select emp_id,emp_email,emp_name,emp_phone,emp_gender,emp_passowrd from emp_data where emp_Id=?");
			pstmt.setInt(1, id);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Employee emp=new Employee();
			    emp.setEmpId(rs.getInt(1));
				emp.setEmail(rs.getString(2));
				emp.setEmpName(rs.getString(3));
				emp.setEmpPhone(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setPassowrd(rs.getString(6));
				return emp;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
		
	}

}
