package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yash.model.Employee;
import com.yash.mvcwebappdemo2.daoimpl.EmployeeDao;

@Controller
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired
	EmployeeDao ed;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveEmployee(Employee emp) {
		boolean status= ed.saveData(emp);
		return "redirect:http://localhost:8080/mvcwebappdemo2/web/employeeregister?status="+status;
	}
	
	@RequestMapping(value = "/getbyid",method = RequestMethod.POST)
	public String getId(Employee emp,ModelMap map) {
		Employee emp1= ed.get(emp.getEmpId());
		map.addAttribute("emp1", emp1);
		return "empsearch";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String getUpdate(Employee emp,ModelMap map) {
		boolean b= ed.updateData(emp);
		Employee e=ed.get(emp.getEmpId());
		map.addAttribute("status", b);
		map.addAttribute("emp", e);
		return "update";
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String getDelete(Employee emp,ModelMap map) {
		Boolean b= ed.deleteData(emp);
		map.addAttribute("status", b);
		return "delete";
	}
	
}
