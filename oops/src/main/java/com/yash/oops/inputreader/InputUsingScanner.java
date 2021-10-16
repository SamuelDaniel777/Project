package com.yash.oops.inputreader;

import java.util.Scanner;

public class InputUsingScanner {
	public static void main(String []args) {
		String name;
		System.out.print("Please Enter Your Name  ");
		Scanner sc = new Scanner(System.in);
		name= sc.nextLine();
		System.out.println(name);
	}
}
