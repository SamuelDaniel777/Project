package com.yash.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_data")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name", nullable = false)
	private String empName;
	@Column(name = "emp_phone",nullable = false,unique = true)
	private String empPhone;
	@Column(name = "emp_dob",nullable = true)
	private String empDob;
	@Column(name = "emp_gender",nullable = false)
	private String gender;
	@Column(name = "emp_email", nullable = false, unique = true)
	private String email;
	@Column(name = "emp_passowrd",nullable = false)
	private String passowrd;
	
	public Employee() {
	}

	public Employee(int empId, String empName, String empPhone, String empDob, String gender, String email,
			String passowrd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empDob = empDob;
		this.gender = gender;
		this.email = email;
		this.passowrd = passowrd;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpDob() {
		return empDob;
	}

	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empDob=" + empDob
				+ ", gender=" + gender + ", email=" + email + ", passowrd=" + passowrd + "]";
	}

}
