package com.yash.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.yash.model.Project;
import com.yash.repositories.DaoRepository;

@Component
public class DaoImpl {
	
    @Autowired
    private DaoRepository repository;

    public boolean saveOrUpdate(Project pro) {
    	try {
    		repository.save(pro);
            return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    }

    public boolean delete(Project pro) {
    	try {
    		repository.delete(pro);
    		return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
        
    }

    public List<Project> getProjects() {
        return (List<Project>) repository.findAll();
    }

	public boolean updateData(Project pro) {
		try {
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
   
}
