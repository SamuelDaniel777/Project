package com.yash.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yash.model.Employee;

@Controller
@RequestMapping("/web")
public class WebController {
	
	static Logger logger=LoggerFactory.getLogger(WebController.class);
	//home controller main menu 
	@RequestMapping("/home")
	public ModelAndView getString() {
		logger.trace("Index called");
		ModelAndView mav=new ModelAndView("index");
		return mav;
	}
	
	//register controller
	@RequestMapping("/register")
	public ModelAndView regEmployee(Employee emp) {
		logger.trace("Register jsp Called");
		ModelAndView mav=new ModelAndView("register");
		return mav;
	}
	
}
