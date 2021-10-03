package com.yash.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.daoimpl.DaoImpl;
import com.yash.model.Project;
import com.yash.projectserviceimpl.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	static Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
    @Autowired 
    private DaoImpl service;
    
    @Autowired
    private ProjectService psr;

    @GetMapping("/getall")
    public List<Project> getProjects() {
    	return service.getProjects();
    
    }
    
    @PostMapping("/save")
    public void postProjects(Project Pro) {
    	logger.trace("addproject method called"+Pro.getProjectName());
        service.saveOrUpdate(Pro);
    }
    
    @PostMapping("/update")
    public void updateProjects(Project pro) {
    	logger.trace("update method called"+pro);
    	service.saveOrUpdate(pro);
    	
    }
    
    @DeleteMapping("/delete")
    public void delete(Project pro) {
    	logger.trace("delete method called"+pro.getProjectId());
        service.delete(pro);
    }
    
    @PostMapping("/getbyidentifier")
    public Project getByProjectIdentifier(Project pro) {
    	logger.trace("project identifier method called"+pro.getProjectIdentifier());
        Project p= psr.findProjectIdenifier(pro.getProjectIdentifier());
        return p;
    }
    
    @PostMapping("/deletebyidentifier")
    public void deleteByProjectIdentifier(Project pro) {
    	logger.trace("project identifier method called"+pro.getProjectIdentifier());
    	psr.deleteByIdentifier(pro.getProjectIdentifier());
    }


}
