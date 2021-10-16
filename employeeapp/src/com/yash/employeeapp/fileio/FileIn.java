package com.yash.employeeapp.fileio;
/*
 * deserialize data from file and covert into arraylist and return arraylist
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.yash.employeeapp.main.MainApp;
import com.yash.employeeapp.model.Employee;

public class FileIn {
	public ArrayList<Employee> fileIn() throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("E:\\Ems Data\\ems.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList<Employee> ar= (ArrayList<Employee>)ois.readObject();
		fis.close();
		ois.close();
		return ar;
	}

}
