package com.demo.test;

public class NumberToStringClass {
	private double d;

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}
	public String numberOutputString()
	{
		Integer i  =(int)d;
		String str=i.toString();
		return str;
	}
}


