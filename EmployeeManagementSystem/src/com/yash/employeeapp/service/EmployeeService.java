package com.yash.employeeapp.service;

import java.util.ArrayList;
import java.util.List;

import com.yash.employeeapp.model.Employee;

public interface EmployeeService {
	
		void getEmpById(Integer id);
		List<Employee> getEmpByName(String name);
		List<Employee> getEmpByDepartment(String name);
		Employee getHighSalaryEmployee();
		List<Employee> getEmployeeByNameAndSalary(String name,double salary);
		void getDeptList();
		
		public static List<Employee> empList(){
			
			List<Employee> empLst=new ArrayList();
			empLst.add(new Employee(1,"Harsh","hydrabad",987654379,"Dev",10000.00));
			empLst.add(new Employee(2,"Darsh","mumbai",987564346,"Dev",10000.25));
			empLst.add(new Employee(3,"Rahul","Delhi",787123543,"Data Science",20000.50));
			empLst.add(new Employee(4,"Ramesh","Chennai",713312523,"AI ML",21000.50));
			empLst.add(new Employee(5,"Suresh","pune",887123578,"Testing",7000.100));
			empLst.add(new Employee(6,"Bhanu","indore",738239532,"Dev",10000.50));
			empLst.add(new Employee(7,"Chirag","bangalore",743264379,"AI ML",20000.20));
			empLst.add(new Employee(8,"Harsh","hydrabad",987654379,"Data Science",10000));
			return empLst;
		}
		
}
