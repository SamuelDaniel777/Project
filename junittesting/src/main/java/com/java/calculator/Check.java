package com.java.calculator;

import java.util.Scanner;

public class Check {

	public boolean checkNumber(String string) {
		int num=Integer.parseInt(string);
		int currentNumber=num%10;
		num=num/10;
		boolean b=false;
		while(num>0){
	    if(currentNumber <= num % 10){
	            b = true;
	            break;
	           }
	    currentNumber = num % 10;
	    num = num/10;
	       }
	    if(b){
	            return false;
	       }else{
	            return true;
		}
		
		
	}
}
	
	

