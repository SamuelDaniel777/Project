package com.demo.test;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee();
		em.setFirstName("subhash");
		em.setLastName("Sharma");
		em.setCompany("Yash");
		em.setRole("Trainee");
		System.out.println(em.generatePassword());
	}

}
