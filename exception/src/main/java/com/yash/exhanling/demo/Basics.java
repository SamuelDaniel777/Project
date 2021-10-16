package com.yash.exhanling.demo;


class ExceptionDemo{
	static {
		System.out.println("static ran");
	}
	void exDemo()throws  ClassNotFoundException {
		Class.forName("pst");
	}
	int exDemo1(int b)throws ArrayIndexOutOfBoundsException {
		int[] a= {1,2,43,5,6,};
		int c=a[b];
		return c;
	}
}

public class Basics {
	
	public static void main(String[] args) {
		
		ExceptionDemo ex= new ExceptionDemo();
		
		 
		try {
//			int a=5,b=0;
//			a=a/b;
			System.out.println(ex.exDemo1(6));//array index out of bounds exception
			ex.exDemo();//class not found exception
			
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			System.err.println(e);
			System.out.println(e);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println(e);
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println(e);
			System.out.println(e);
		}
		
		finally {
			System.out.println("finally ran");
		}
		
	}

	

}
