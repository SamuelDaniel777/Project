package com.yash.serviceimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.DBConnection;
import com.yash.model.Employee;
import com.yash.mvcwebappdemo2.service.EmpService;

@Service
public class EmployeeServiceImple implements EmpService<Employee> {

	@Autowired
	DBConnection dbcon;

	@Override
	public List<Employee> getAllEmployee() {
		Session s= dbcon.getSession();
		Transaction t= s.beginTransaction();
		Query q= s.createQuery("from Employee");
		List<Employee>e= q.list();
		t.commit();
		s.close();
		return e;
	}

	@Override
	public List<Employee> getAllEmpName() {
		String s=new String();
		return null;
	}

}
