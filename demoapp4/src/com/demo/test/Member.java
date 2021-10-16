package com.demo.test;

public class Member {
	
	private String firstName;
	private String lastName;
	private String email;
	private String passsword;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String showMemberDetails() 
	{
		String name= firstName + lastName;
		String email="sharma.pankaj@yash.com";
		String password="12345";
		String role="Trainer";
		return name+email+password+role;
	}
}
