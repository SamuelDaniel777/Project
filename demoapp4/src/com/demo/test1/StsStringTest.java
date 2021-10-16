package com.demo.test1;


class Demo
{
	String swapp(String s) {
		String firstName=s.substring(0, s.indexOf(" "));
		String lastName=s.substring(s.indexOf(" "));
		String stringSwapped = lastName + firstName;
		return stringSwapped;
	}


}

public class StsStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo D1=new Demo();
		D1.swapp("Dharmesh Rane");
	}

}
