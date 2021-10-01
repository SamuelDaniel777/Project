package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.yash.model.Project;
import com.yash.repository.ProjectRepository;

@Component
public class ProjectService {
    @Autowired
    private ProjectRepository repository;

    public void add(Project product) {
         repository.save(product);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public List<Project> getProjects() {
        return (List<Project>) repository.findAll();
    }
//    private Dog toEntity(DogDto dto) {
//        Dog entity = new Dog();
//        entity.setName(dto.getName());
//        entity.setAge(dto.getAge());
//        return entity;
//    }

    

  


}
