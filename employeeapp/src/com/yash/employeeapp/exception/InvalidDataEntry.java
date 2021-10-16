package com.yash.employeeapp.exception;
/*
 * throws runtime exception
 * invalid data entry from employeedata
 */
import java.io.IOException;

import com.yash.employeeapp.main.EmployeeData;

public class InvalidDataEntry extends RuntimeException {
	public InvalidDataEntry(String string) throws NumberFormatException, IOException, ClassNotFoundException, InvalidId, InvalidString {
		System.err.println(string);
		EmployeeData.searchEmployeeBy();
	}

	
}
