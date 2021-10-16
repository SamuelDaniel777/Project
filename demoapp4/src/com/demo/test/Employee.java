package com.demo.test;

import java.util.Random;

public class Employee {
	private String firstName;
    private String lastName;
	private String company;
	private String role;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String generatePassword() {
		
		String st1= firstName.substring(0,2);
		String st2= lastName.substring(0,2);
		String st3= company.substring(0,2);
		String st4= role.substring(0,2);
		
		
	   return st1+st2+st3+st4;

	}
}
