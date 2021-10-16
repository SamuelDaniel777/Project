package com.yash.employeeapp.serviceimp;
/*
 * Remove employee from current file arraylist
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.yash.employeeapp.exception.InvalidId;
import com.yash.employeeapp.exception.InvalidString;
import com.yash.employeeapp.fileio.FileIn;
import com.yash.employeeapp.fileio.FileOut;
import com.yash.employeeapp.main.MainApp;
import com.yash.employeeapp.model.Employee;

public class RemoveData {
		
		public static void RemoveEmp() throws IOException, ClassNotFoundException, NumberFormatException, InvalidId, InvalidString {
			System.out.println("Enter Id to remove employee");
			Scanner sc=new Scanner(System.in);
			Integer i=Integer.parseInt(sc.next());
			FileIn fi=new FileIn();
			ArrayList<Employee>arlst= fi.fileIn();
			arlst.removeIf(p->p.getEmpId().equals(i));
			arlst.forEach(System.out::println);
			FileOut.saveEmpFile(arlst);
		}
}
