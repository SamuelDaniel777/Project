package com.yash.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Project;
import com.yash.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired ProjectService service;

    @GetMapping
    public List<Project> getProjects() {
        return service.getProjects();
    }

    @PostMapping
    public void postProjects(Project Pro) {
        service.add(Pro);
    }
  
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}
