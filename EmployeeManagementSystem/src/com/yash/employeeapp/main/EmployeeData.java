package com.yash.employeeapp.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.yash.employeeapp.exception.InvalidDataEntry;
import com.yash.employeeapp.model.Employee;
import com.yash.employeeapp.serviceimp.EmployeeServiceImpl;

public class EmployeeData  {

	public static void searchEmployeeBy() throws NumberFormatException, IOException, ClassNotFoundException {
		
		System.out.println("1)Get Employee by ID");
		System.out.println("2)Enter Employee Name");
		System.out.println("3)Enter Employee Department");
		System.out.println("4)Employee with highest salary");
		System.out.println("5)Enter Employee name and salary");
		System.out.println("6)Get department list");
		System.out.println("7)Back To Main Menu");
		System.out.println("======================================");
		System.out.print("Enter value Here---->");
		BufferedReader enterValue=new BufferedReader(new InputStreamReader(System.in));
		String keyentered=enterValue.readLine();
		Pattern p = Pattern.compile("[1234567]");
		Matcher m = p.matcher(keyentered);
		if (m.find()==true) {
			EmployeeServiceImpl esi=new EmployeeServiceImpl();
			int key=Integer.parseInt(keyentered);
			switch (key) {
			case 1:
				System.out.println("Enter Employee Id");
				BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
				int employeeID=Integer.parseInt(br1.readLine());
				esi.getEmpById(employeeID);
				break;
				
			case 2:
				System.out.println("Enter Employee Name");
				BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
				String een=br2.readLine();
				esi.getEmpByName(een);
				break;
			
			case 3:
				System.out.println("Enter Department Name");
				BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
				String dns=br3.readLine();
				esi.getEmpByDepartment(dns);
				break;
				
			case 4:
				esi.getHighSalaryEmployee();
				break;
				
			case 5:
				System.out.println("Enter Name");
				BufferedReader br4=new BufferedReader(new InputStreamReader(System.in));
				String name=br4.readLine();
				System.out.println("Enter Salary");
				BufferedReader br5=new BufferedReader(new InputStreamReader(System.in));
				double salary =Double.parseDouble(br5.readLine());
				esi.getEmployeeByNameAndSalary(name, salary);
				break;
				
			case 6:
				esi.getDeptList();
				break;
			
			case 7:
				MainApp.mainMenu();
				break;
				
			default:
				break;
			}
		} else {
			throw new InvalidDataEntry("Invalid Value Please Enter 1,2,3,4,5,6 or 7");
		}
	}

}
