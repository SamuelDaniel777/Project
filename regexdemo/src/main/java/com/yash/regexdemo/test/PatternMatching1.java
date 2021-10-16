package com.yash.regexdemo.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching1 {
	//for 
	public static void main(String[] args) {
		String str="0755-2123456";
		Pattern p = Pattern.compile("(0755)[-][27][0-9]{6}$");
		Matcher m =  p.matcher(str);
		if (m.find()==true) {
			System.out.println("Accepted"+m.group());
		} else {
			System.out.println("Invalid");
		}
		
	}
}
