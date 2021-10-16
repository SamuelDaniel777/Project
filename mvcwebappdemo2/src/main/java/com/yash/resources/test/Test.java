package com.yash.resources.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.yash.model.Employee;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		t.commit();
		Employee employee=new Employee();
		employee.setEmpId(2);
		s.delete(employee);
		s.close();
		sf.close();
		
	}
}
