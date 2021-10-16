package com.yash.employeeapp.exception;

import java.io.IOException;

import com.yash.employeeapp.main.MainApp;

public class InvalidEntry extends RuntimeException {
	public InvalidEntry(String s) throws NumberFormatException, IOException, ClassNotFoundException {
		System.err.println(s);
		MainApp.mainMenu();
	}
}
