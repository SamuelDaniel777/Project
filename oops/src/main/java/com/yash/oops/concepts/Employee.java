package com.yash.oops.concepts;

import com.yash.oops.concepts1.Person;

public class Employee extends Person{
		Double salary;
		int empId;
		
		
		public Employee(String name, int age, Double salary, int empId) {
			super(name, age, name);
			this.salary = salary;
			this.empId = empId;
		}


		@Override
		public String toString() {
			return "Employee [salary=" + salary + ", empId=" + empId + "]";
		}
		
		
		
		
}
