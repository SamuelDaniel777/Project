package com.yash.exhanling.assignment;

public class Assignment4 {

	public static void main(String[] args) {
		
		Product pr=new Product();
		String[] obj1=pr.display1();
		String[] obj2=pr.display2();
		String[] obj3=pr.display3();
		
		try {
			for (int i = 0; i < obj3.length; i++) {
				System.out.println(obj1[i]);
			}
		} 
		catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
				System.err.println(e);
		}
		
		
		
	}
			
		
		
}


