package com.yash.employeeapp.exception;
/*
 * throw exception for invalid string type 
 * 
 */
import java.io.IOException;

import com.yash.employeeapp.main.EmployeeData;

public class InvalidString extends Exception {
	public InvalidString(String s) throws NumberFormatException, ClassNotFoundException, IOException, InvalidId, InvalidString {
		System.err.println(s);
		EmployeeData.searchEmployeeBy();
	}

}
