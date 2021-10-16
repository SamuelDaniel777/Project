package com.java.calculator;

public class Calculator {
	
	public Integer calculate(String i) {
		if (i=="") {
			return 0;
		}
		else {
		
			Integer j =Integer.parseInt(i);//string to integer conversion
			return j;
		}
	}

	public Integer calculate(int i, int j) {
		
		return i+j;
	}

}
