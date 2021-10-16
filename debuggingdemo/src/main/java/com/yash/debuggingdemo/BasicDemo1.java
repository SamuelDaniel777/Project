package com.yash.debuggingdemo;

public class BasicDemo1 {

	public static void main(String[] args) {
		int a=0;
		add();
		a=a++ + ++a + a++ + a+1;
		if (a>20) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");

		}

	}

	private static int add() {
		int a=1,b=1,c;
		c=a+b;
		return c;
		
	}

}
