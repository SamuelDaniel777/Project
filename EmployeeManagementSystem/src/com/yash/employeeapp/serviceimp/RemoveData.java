package com.yash.employeeapp.serviceimp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.yash.employeeapp.model.Employee;

public class RemoveData {
		public static void RemoveEmp() throws IOException, ClassNotFoundException {
			System.out.println("Enter Id to remove employee");
			FileInputStream fis=new FileInputStream("E:\\Ems Data\\ems.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList<Employee> ar= (ArrayList<Employee>)ois.readObject();
			
		}
	
}
