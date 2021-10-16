package com.yash.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.daoimpl.EmployeeDao;
import com.yash.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmpController {
	
	Logger logger=LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmployeeDao ed;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveEmployee(Employee emp) {
		logger.trace("save method called");
		boolean status= ed.saveData(emp);
		return "redirect:/web/register?status="+status;
	}
	
	@RequestMapping(value = "/getbyid",method = RequestMethod.POST)
	public String getId(Employee emp,ModelMap map) {
		Employee emp1= ed.get(emp.getEmpId());
		map.addAttribute("emp", emp1);
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
