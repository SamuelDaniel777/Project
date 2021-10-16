package com.yash.productcartapp.sync; 

class Test1{
	 void fun1() {
		System.out.println("Hello test1");
	}
	
}
class Test2 extends Test1{
	@Override
	 void fun1() {
		System.out.println("Hello test2");
	}
	
}

public class Test {

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.fun1();
		
	}

}
