package com.yash.regexdemo.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching3 {
	public static void main(String []args) {
		String str="10,00,00,000";
		Pattern p = Pattern.compile("[0-9]{2}[,][0-9]{2}[,][0-9]{2}[,][0-9]{3}$");
		Matcher m = p.matcher(str);
		if (m.find()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		
	}
}
