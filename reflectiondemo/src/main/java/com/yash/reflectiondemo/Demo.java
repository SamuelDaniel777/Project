package com.yash.reflectiondemo;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		
		ar.add("samuel");
		ar.add("daniel");
		ar.add(10);
		
		Integer a=1;
		int b=a;
		double d=10.11;
//		String ster="1";
//		String sr=(String)a;
		int f= (int)d;
		String st=a.toString();

		Integer s=(Integer)ar.get(2);
		System.out.println(s);
	}

}
