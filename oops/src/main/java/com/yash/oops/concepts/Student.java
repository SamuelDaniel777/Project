package com.yash.oops.concepts;

import com.yash.oops.concepts1.Person;

public class Student extends Person{
	
	
	int rollNo;
	double marks;
	String hobby;
	
	public Student() {
		System.out.println("Student Default constructor called");
	}
	
	public Student(String name, int age, String gender, int rollNo, double marks, String hobby) {
		super(name, age, gender);
		this.rollNo = rollNo;
		this.marks = marks;
		this.hobby = hobby;
	}
	
	

}
