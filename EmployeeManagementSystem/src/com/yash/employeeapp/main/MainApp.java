package com.yash.employeeapp.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.yash.employeeapp.exception.InvalidEntry;
import com.yash.employeeapp.fileio.FileIn;
import com.yash.employeeapp.fileio.FileOut;
import com.yash.employeeapp.model.Employee;
import com.yash.employeeapp.service.InputData;

public class MainApp {
	public static void mainMenu() throws NumberFormatException, IOException, ClassNotFoundException {
		System.out.println("Welcome to Yash Employee Portal");
		System.out.println("1) Enter Employee Data");
		System.out.println("2) search Employee by");
		System.out.println("3) Delete Employee");
		System.out.println("4) Read Data from existing file");
		System.out.println("5) Exit Application");
		System.out.print("select one from above example(1,2,3,4,5)--> ");
		Scanner scanner = new Scanner(System.in);
		String key=scanner.next();
		System.out.println("================================================");
		Pattern p = Pattern.compile("[12345]");
		Matcher m = p.matcher(key);
		
		if (m.find()==true) {
			int trueValue=Integer.parseInt(key);
			switch (trueValue) {
			case 1:
				InputData id=new InputData();
				ArrayList<Employee> arlst=(ArrayList<Employee>) id.EmployeeInput();
				arlst.stream().forEach(System.out::println);
				FileOut.saveEmpFile(arlst);
				break;
			case 2:
				EmployeeData em= new EmployeeData();
				em.searchEmployeeBy();
				break;
			case 3:
				
				break;
			case 4:
				FileIn.fileIn();
				break;
			case 5:
				System.out.println("Exiting Application");
				System.exit(0);
			default:
				break;
			}
				
		} else {
			
			throw new InvalidEntry("Invalid Value Entered Please Enter 1,2,3,4 or 5");
			
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException {

		mainMenu();
		
	}

}
