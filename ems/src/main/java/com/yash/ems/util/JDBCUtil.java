package com.yash.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection psDemo() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata?zeroDateTimeBehavior=convertToNull","root","");
		System.out.println("db connected");
		return conn;
		
	}
}
