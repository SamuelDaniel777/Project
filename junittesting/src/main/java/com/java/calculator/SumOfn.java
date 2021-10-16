package com.java.calculator;



public class SumOfn {
	private int sum=0;
	public int calculateSum(int num) {
		for(int i=1;i<=num;i++){
			if (i%3==0 || i%5==0) {
			sum+=i;
			}
		
		}
		return sum;
		
	}
	public Integer calculateSum(String string) {
		if (string=="") {
			System.out.println("");
			
			return 0;
		}
		return 0;
	}

}
