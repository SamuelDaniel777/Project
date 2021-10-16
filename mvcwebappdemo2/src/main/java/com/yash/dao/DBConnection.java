package com.yash.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;

@Repository
public class DBConnection {
	
	private SessionFactory sf;
	public DBConnection() {
		try {
			Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
			this.sf=cfg.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("failed hibernate configuration");
			e.printStackTrace();
		}
		
	}
	public Session getSession() {
		return this.sf.openSession();		
	}
}
