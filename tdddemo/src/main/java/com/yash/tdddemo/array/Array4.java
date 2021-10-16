package com.yash.tdddemo.array;

import java.util.Iterator;

public class Array4 {

	public String reverseString(String string) {
		
//		char[] actualString= string.toCharArray();
//		int actualStringSize=actualString.length;
//		char[] reverseStringArray=new char[actualStringSize];
//		
//		for(int i=0;i<actualStringSize;i++) {
//			reverseStringArray[i]=actualString[actualStringSize-i-1];
//			
//		}
//		 String str = reverseStringArray.toString();
//		 return str;
		 
		StringBuilder sb=new StringBuilder();
		 sb.append(string);
		 sb.reverse();
		 String str=sb.toString();
		 return str;
		
	}
	

}
