package com.yash.tdddemo.array;



public class Array5 {
	
	public static void main(String[] args) {
		String[] ar= {"Tea","Coffee","Juice"};	
		String input="Juice";
		Boolean b1=true;
		Boolean b2=false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==input)
			{
				System.out.println("matched");
				
			}
			else {
				System.out.println("not matched");
				
			}
		
	}
	
	}
	
}
