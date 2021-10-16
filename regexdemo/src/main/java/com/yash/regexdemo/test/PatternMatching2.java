package com.yash.regexdemo.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching2 {
	public static void main(String[] args) {
		String str="3646-1234-1234";
		Pattern p = Pattern.compile("(3646)[-][0-9]{4}[-][0-9]{4}$");
		Matcher m = p.matcher(str);
		if (m.find()==true) {
			System.out.println("valid");
		}
		else {
			System.out.println("invlaid");
		}
	}
}
