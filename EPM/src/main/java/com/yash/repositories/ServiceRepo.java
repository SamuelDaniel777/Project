package com.yash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Project;

@Repository
public interface ServiceRepo extends JpaRepository<Project, Integer> {
	
	public Project getProjectByProjectIdentifier(String proIdf);
	
}