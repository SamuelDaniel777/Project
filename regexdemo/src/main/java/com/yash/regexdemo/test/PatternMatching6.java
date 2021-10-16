package com.yash.regexdemo.test;


import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		String gs="\"I have a cat, but I like my dog more. I also \r\n"
				+ "have a horse";
	
		Pattern p1 = Pattern.compile("cat dog horse");
		String[] str=p1.split(gs);
		Matcher m1=p1.matcher(gs);
		
		
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//			
//			
//			System.out.print("");
//			}
//		}
		
		
		
		
		while (m1.find()) {
			
			System.out.print(m1.group());
			
		}
		
		
	}
}

