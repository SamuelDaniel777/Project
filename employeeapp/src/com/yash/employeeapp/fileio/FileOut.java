package com.yash.employeeapp.fileio;
/*
 * serialize data current list data into file
 * 
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.employeeapp.exception.InvalidId;
import com.yash.employeeapp.exception.InvalidString;
import com.yash.employeeapp.main.MainApp;
import com.yash.employeeapp.model.Employee;
import com.yash.employeeapp.service.EmployeeService;
import com.yash.employeeapp.service.InputData;
import com.yash.employeeapp.util.BooleanDef;

public class FileOut {
	public static void saveEmpFile(ArrayList<Employee> arlst) throws IOException, NumberFormatException, ClassNotFoundException, InvalidId, InvalidString{

		System.out.println("Would you like to save the data in a file? Enter 1 for 'YES' 0 for 'NO'");
		Scanner sc7=new Scanner(System.in);
		int bolVal=Integer.parseInt(sc7.next());
		boolean b=BooleanDef.bolean(bolVal);
		if (b==true) {
			FileOutputStream fos=new FileOutputStream("E:\\Ems Data\\ems.txt");
		    ObjectOutputStream oos=new ObjectOutputStream(fos);
		    oos.writeObject(arlst);
		    oos.flush();
		    oos.close();
			System.out.println("Write successful");
			MainApp.mainMenu();
			
		} else {
			MainApp.mainMenu();
		}
		
		
	}
	
}



