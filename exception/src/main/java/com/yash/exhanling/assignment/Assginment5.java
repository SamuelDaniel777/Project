package com.yash.exhanling.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Assginment5 {

	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("Enter product id ");
		int id= Integer.parseInt(br.readLine());
		
		System.out.print("Enter product name ");
		String name = br.readLine();
		
		System.out.print("Enter product price ");
		double price = Double.parseDouble(br.readLine());
		
		
		ProductApp ap = new ProductApp(id,name,price);
		System.out.println(ap);
		}
		catch (NumberFormatException  | IOException e) {
			e.fillInStackTrace();
		}
		
	}

}
