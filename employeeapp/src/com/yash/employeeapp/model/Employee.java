package com.yash.employeeapp.model;
/*
 * Employee model 
 * 
 */
import java.io.Serializable;
import java.util.List;

public class Employee implements Comparable<Employee>,Serializable {
	
	private Integer empId;
	private String empName;
	private String location;
	private long phoneNumber;
	private String department;
	private double salary;
	
	public Employee() {
	}
	
	
	public Employee(Integer empId, String empName, String location, long phoneNumber, String department,
			double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	

	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", location=" + location + ", phoneNumber="
				+ phoneNumber + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.getSalary()>o.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
	

}
