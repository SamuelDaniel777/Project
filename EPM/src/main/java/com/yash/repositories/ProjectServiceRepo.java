package com.yash.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Project;

@Repository
public interface ProjectServiceRepo extends JpaRepository<Project, Integer> {
	
	public Project getProjectByProjectIdentifier(String proIdf);
	
}