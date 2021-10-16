package com.yash.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.yash.exception.InvalidDataException;
import com.yash.model.Employee;
import com.yash.serviceimpl.EmployeeService;
import com.yash.util.FileUploading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@Autowired
	FileUploading fu;
	
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	//save employee details 
	@PostMapping(value = "/save")
//	public String saveEmp(@RequestParam(value = "fileName", required = false)MultipartFile file) {
	public String saveEmp(Employee emp) throws InvalidDataException{

//	logger.trace("file uploading"+file.getOriginalFilename());
//		
//		try {
//			boolean fileStatus=fu.setFile(file);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//	emp=null;
			
			logger.trace("Save method called");
			es.saveEmp(emp);
			return "register";
		
	}
}
