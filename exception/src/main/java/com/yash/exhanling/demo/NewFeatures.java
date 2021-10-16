package com.yash.exhanling.demo;

import java.util.Scanner;

public class NewFeatures {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){//try with resource
//			int a=1,b=0;		
//			a/=b;						//java 1.7 features	
			Class.forName("nst");
		} catch (ArithmeticException | ClassNotFoundException e) {//multicatch 
			System.err.println(e);	
		}
		
	}

}
