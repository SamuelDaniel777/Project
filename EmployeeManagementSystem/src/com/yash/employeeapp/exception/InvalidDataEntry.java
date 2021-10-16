package com.yash.employeeapp.exception;

import java.io.IOException;

import com.yash.employeeapp.main.EmployeeData;

public class InvalidDataEntry extends RuntimeException {
	public InvalidDataEntry(String string) throws NumberFormatException, IOException, ClassNotFoundException {
		System.err.println(string);
		EmployeeData.searchEmployeeBy();
	}

	
}
