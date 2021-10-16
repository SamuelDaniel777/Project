package com.yash.mvcwebappdemo2.daoimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.yash.dao.DBConnection;
import com.yash.dao.EmpDaoInterface;
import com.yash.model.Employee;

@Repository
public class EmployeeDao implements EmpDaoInterface<Employee> {
	
	@Autowired
	private DBConnection dbCon;
	
	@Override
	public boolean saveData(Employee ob) {
		try {
			String pattern = "dd/MM/yyyy";
			SimpleDateFormat sdf=new SimpleDateFormat(pattern);
			String date= sdf.format(ob.getEmpDob());
			Session session = dbCon.getSession();
			Transaction t=session.beginTransaction();
	//		ob.setEmpDob(new Date());
			session.save(ob);
			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}
	
	@Override
	public boolean updateData(Employee ob) {
		try {
			
			Session s = dbCon.getSession();
			Transaction t= s.beginTransaction();
			s.update(ob);
			t.commit();
			s.close();
			return true;
			
		} catch (Exception e) {
			System.err.println("failed updation");
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean deleteData(Employee ob) {
		
		try {
			Session session = dbCon.getSession();
			Transaction t=session.beginTransaction();
			System.out.println(ob.getEmpId());
		    int i=ob.getEmpId();
			Query query=session.createQuery("delete from Employee where id=:i");  
			query.setParameter("i", i);
			query.executeUpdate();
			t.commit();
			session.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Employee get(int id) {
		Session session=dbCon.getSession();
		Employee emp= session.get(Employee.class, id);
		session.close();
		return emp;
		
	}

}
