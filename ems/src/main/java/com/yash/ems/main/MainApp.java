package com.yash.ems.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.yash.ems.serviceimpl.EmsData;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc1 = new Scanner(System.in);
		int id= Integer.parseInt(sc1.next());
		Scanner sc2 = new Scanner(System.in);
		String name= sc2.next();
		Scanner sc3 = new Scanner(System.in);
		double d = Double.parseDouble(sc3.next());
		EmsData.insertData(id, name, d);
	}
}
