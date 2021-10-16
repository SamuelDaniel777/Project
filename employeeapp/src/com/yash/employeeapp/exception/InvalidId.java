package com.yash.employeeapp.exception;
/*
 * throw exception for inavlid id type employee
 * 
 */
import java.io.IOException;

import com.yash.employeeapp.main.EmployeeData;
import com.yash.employeeapp.main.MainApp;

public class InvalidId extends Exception {
	public InvalidId(String string) throws NumberFormatException, ClassNotFoundException, IOException, InvalidId, InvalidString {
		System.err.println(string);
		EmployeeData.searchEmployeeBy();
	}
	
}
