package com.yash.projectserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Project;
import com.yash.repositories.ProjectServiceRepo;


@Service
public class ProjectService {
	
	@Autowired
	ProjectServiceRepo ps;
	
	public Project findProjectIdenifier(String proIf) {
		Project p= ps.getProjectByProjectIdentifier(proIf);
		return p;
	}
	
	public void deleteByIdentifier(String proIf) {
		Project p= ps.getProjectByProjectIdentifier(proIf);
		ps.delete(p);
		
	}
	
}
