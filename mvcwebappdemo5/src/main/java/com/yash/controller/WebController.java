package com.yash.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.model.Employee;
import com.yash.mvcwebappdemo2.service.EmpService;
import com.yash.serviceimpl.EmployeeServiceImple;

@Controller
@RequestMapping("/web")
public class WebController {
	
	@Autowired
	EmployeeServiceImple esi;
	
	@RequestMapping(value = "/employeeregister",method = RequestMethod.GET)
	public ModelAndView empReg(@RequestParam(value = "status", required = false)Boolean status) {
		ModelAndView mav=new ModelAndView("register");
		mav.addObject("status", status);
		return mav;
	}
	
	@RequestMapping(value = "/searchid",method = RequestMethod.GET)
	public ModelAndView empId() {
		ModelAndView mav=new ModelAndView("empsearch");
		return mav;
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public ModelAndView empDelete() {
		ModelAndView mav=new ModelAndView("delete");
		return mav;
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public ModelAndView empUpdate() {
		ModelAndView mav=new ModelAndView("update");
		return mav;
	}
	
	@RequestMapping(value = "/getall",method = RequestMethod.GET)
	public ModelAndView empGetAll() throws SQLException {
		System.out.println("called");
		ModelAndView mav=new ModelAndView("getall");
		List<Employee>e=esi.getAllEmployee();
		System.out.println(e);
		mav.addObject("emp", e);
		return mav;
	}
}
