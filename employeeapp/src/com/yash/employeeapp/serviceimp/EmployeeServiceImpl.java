package com.yash.employeeapp.serviceimp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.yash.employeeapp.exception.InvalidId;
import com.yash.employeeapp.exception.InvalidString;
import com.yash.employeeapp.fileio.FileIn;
import com.yash.employeeapp.main.MainApp;
import com.yash.employeeapp.model.Employee;
import com.yash.employeeapp.service.EmployeeService;
import com.yash.employeeapp.util.IdCheck;

public class EmployeeServiceImpl implements EmployeeService {
	FileIn fi=new FileIn();
	
	@Override
	public void getEmpById(Integer id) throws NumberFormatException, ClassNotFoundException, IOException, InvalidId, InvalidString  {
			ArrayList<Employee>empl= fi.fileIn();
			Function<Employee, Boolean>e=f->f.getEmpId().equals(id);
			Predicate<Employee>p=e::apply;
			List<Employee>emplst= empl.stream().filter(p).collect(Collectors.toList());
			System.out.println(emplst);
			MainApp.mainMenu();
	}

	@Override
	public List<Employee> getEmpByName(String name) throws ClassNotFoundException, IOException {
		ArrayList<Employee>empl= fi.fileIn();
		Function<Employee, Boolean> f=e1->e1.getEmpName().equals(name);
		Predicate<Employee> p=f::apply;
		List<Employee>lst= empl.stream().filter(p).collect(Collectors.toList());
		System.out.println(lst);
		return null;
	}

	@Override
	public List<Employee> getEmpByDepartment(String department) throws ClassNotFoundException, IOException {
		ArrayList<Employee>emplst= fi.fileIn();
		Predicate<Employee> p=d->d.getDepartment().equals(department);
		List<Employee>lst= emplst.stream().filter(p).collect(Collectors.toList());
		System.out.println(lst);
		return null;
	}

	@Override
	public Employee getHighSalaryEmployee() throws ClassNotFoundException, IOException {
		ArrayList<Employee>emplst= fi.fileIn();
		Employee max=Collections.max(emplst);
		System.out.println("Max salary is "+max.getSalary());
		return null;
	}

	@Override
	public List<Employee> getEmployeeByNameAndSalary(String name, double salary) throws ClassNotFoundException, IOException {
		ArrayList<Employee>emplst= fi.fileIn();
		BiPredicate<String,Double> p=(e1,es1)-> e1.equals(name)&& es1==salary;
		List<Employee>em= emplst.stream().filter(e->p.test(e.getEmpName(), e.getSalary())).collect(Collectors.toList());
		System.out.println("employee name and salary is"+em);
		return null;
	}

	@Override
	public void getDeptList() throws ClassNotFoundException, IOException {
		ArrayList<Employee>emplst= fi.fileIn();
		Set<Employee> getalldepartment=new HashSet<>(emplst);
		Function<Employee, String> gad=e->e.getDepartment();
		Set<String> s = getalldepartment.stream().map(gad).collect(Collectors.toSet());
		System.out.println("All Department list"+s);
	}

}
