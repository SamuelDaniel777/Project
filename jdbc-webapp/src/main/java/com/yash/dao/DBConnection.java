package com.yash.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Repository;

@Repository
public class DBConnection {
	
	private Connection con;
	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			 this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","");
		} catch (Exception e) {
			System.err.println("failed jdbc connection");
			e.printStackTrace();
		}

	}
	public Connection getConnection() {
		return this.con;
	}
	
}

