package com.yash.regexdemo.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching5 {
	public static void main(String[] args) {
		String email="samuel.daniel@yash.com";
		Pattern p = Pattern.compile("[a-z A-Z]*[.][a-z A-Z]*@yash.com");
		Matcher m = p.matcher(email);
		if (m.find()==true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		
	}
}
