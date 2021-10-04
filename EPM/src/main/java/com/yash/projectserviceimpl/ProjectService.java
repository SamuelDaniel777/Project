package com.yash.projectserviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.exception.BODataNotFoundException;
import com.yash.model.Project;
import com.yash.repositories.ServiceRepo;


@Service
public class ProjectService {
	
	@Autowired
	ServiceRepo ps;
	
	public Project findProjectIdenifier(String proIf) throws BODataNotFoundException {
		try {
			Project p= ps.getProjectByProjectIdentifier(proIf);
			return p;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BODataNotFoundException("No data found in database");
			
		}
		
	}
	
	public Boolean deleteByIdentifier(String proIf) {
		try {
			Project p= ps.getProjectByProjectIdentifier(proIf);
			ps.delete(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
}
