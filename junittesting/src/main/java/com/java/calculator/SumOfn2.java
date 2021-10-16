package com.java.calculator;

public class SumOfn2 {

	public String calculateDifference(String string) {
		Integer i = Integer.parseInt(string);
		if (i<=0) {
			String str="Invalid Entry";
			return str;
		}
		else {
			
			int j = i*(i+1)*(2*i+1)/6;
			int k=(int)Math.pow(i*(i+1)/2,2);
			Integer sum=j-k;
			String st= sum.toString();
			return st;
		}
	
	}

	

	

	
}
