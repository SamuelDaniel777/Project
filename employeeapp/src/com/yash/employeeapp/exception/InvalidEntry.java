package com.yash.employeeapp.exception;
/*
 * invalid data entry from mainapp
 * 
 */
import java.io.IOException;

import com.yash.employeeapp.main.MainApp;

public class InvalidEntry extends RuntimeException {
	public InvalidEntry(String s) throws NumberFormatException, IOException, ClassNotFoundException, InvalidId, InvalidString {
		System.err.println(s);
		MainApp.mainMenu();
	}
}
