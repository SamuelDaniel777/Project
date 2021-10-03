package com.yash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long>{
	
}
