package com.yash.oops.concepts1;

public class Employee extends Person{
		Double salary;
		int empId;
		
		
		public Employee(String name, int age, Double salary, int empId) {
			super(name, age);
			this.salary = salary;
			this.empId = empId;
		}


		public Double getSalary() {
			return salary;
		}


		public int getEmpId() {
			return empId;
		}


		@Override
		public String toString() {
			return "Employee [salary=" + salary + ", empId=" + empId + ", name=" + name + ", age=" + age + "]";
		}


		


		
		
		
		
		
		
}
