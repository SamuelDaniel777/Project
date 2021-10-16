package com.yash.daoimpl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.dao.EmpDaoInterface;
import com.yash.model.Employee;

@Repository
public class EmployeeDao{
	
	static Logger logger=LoggerFactory.getLogger(EmployeeDao.class);
	
	@Autowired
	EmpDaoInterface edi;
	
	public boolean saveData(Employee ob) {
		try {
			if (ob!=null) {
				edi.save(ob);
				return true;
			}
			else {
				return false;
			}
		}
		 catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	
	}
		
	public boolean updateData(Employee ob) {
		
		try {
			
		Employee emp=edi.getById(ob.getEmpId());
		emp.setEmpId(ob.getEmpId());
			emp.setEmail(ob.getEmail());
			emp.setEmpName(ob.getEmpName());
			emp.setEmpPhone(ob.getEmpPhone());
			emp.setGender(ob.getGender());
			emp.setPassowrd(ob.getPassowrd());
			emp.setEmpDob(ob.getEmpDob());
			edi.save(emp);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean deleteData(Employee ob) {
		
		try {
			edi.deleteById(ob.getEmpId());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public Employee get(int id) {
		Employee emp= edi.getById(id);
		return emp;
	}

}
