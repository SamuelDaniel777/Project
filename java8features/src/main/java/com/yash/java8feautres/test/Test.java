package com.yash.java8feautres.test;

interface Demo{
    static int a=0;
	void fun();
	default void fun1() {
		System.out.println("Default ");
	}
	static void fun2() {
		System.out.println("static called");
	}
	void fun3();
}

interface FuntionalInterfaceDemo{
	 int show(int a,int b);
}

class A implements Demo{

	@Override
	public void fun() {
		System.out.println("Hello from fun");
	}
	static void fun2() {
		System.out.println("fun2 static from class A");
	}
	@Override
	public void fun3() {
		
	}
}

public class Test  {
	
	public static void main(String[] args) {
		A a=new A();
		a.fun();
		a.fun1();
		Demo.fun2();
		a.fun2();
		Demo d= new Demo() {
			
			@Override
			public void fun3() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}
		};
		
		FuntionalInterfaceDemo fid=(num,num1)-> {
			return num+num1;
		};
		System.out.println(fid.show(12, 14));
		
		
	}
}
