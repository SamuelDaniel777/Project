package com.yash.employeeapp.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.yash.employeeapp.main.MainApp;
import com.yash.employeeapp.model.Employee;

public class FileIn {
	public static void fileIn() throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("E:\\Ems Data\\ems.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList<Employee> ar= (ArrayList<Employee>)ois.readObject();
		ar.stream().forEach(System.out::println);
		MainApp.mainMenu();
		
	}

}
