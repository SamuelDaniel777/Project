package com.yash.employeeapp.service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.yash.employeeapp.fileio.FileOut;
import com.yash.employeeapp.main.MainApp;
import com.yash.employeeapp.model.Employee;
import com.yash.employeeapp.util.BooleanDef;

public class InputData {
	
	public List<Employee> EmployeeInput() throws NumberFormatException, IOException, ClassNotFoundException{
	List<Employee>emp= EmployeeService.empList();
	System.out.println("Please Enter amount of employees");
	Scanner sc=new Scanner(System.in);
	int i=Integer.parseInt(sc.next());
	for(int x=1;x<=i;x++) {
		
		System.out.println("Enter Employee Id");
		Scanner sc1=new Scanner(System.in);
		int id=Integer.parseInt(sc1.next());
		System.out.println("Enter Name");
		Scanner sc2=new Scanner(System.in);
		String name=sc2.next();
		System.out.println("Enter Location");
		Scanner sc3=new Scanner(System.in);
		String location=sc3.next();
		System.out.println("Enter Phone number");
		Scanner sc4=new Scanner(System.in);
		long phone=Long.parseLong(sc4.next());
		System.out.println("Enter department");
		Scanner sc5=new Scanner(System.in);
		String department=sc5.next();
		System.out.println("Enter salary");
		Scanner sc6=new Scanner(System.in);
		double salary=Double.parseDouble(sc6.next());
		emp.add(new Employee(id,name,location,phone,department,salary));
		System.out.println("!....Data Registered");
		
	}
	return emp;
	}
	
	public static void save() throws NumberFormatException, ClassNotFoundException, IOException {

	}
}
