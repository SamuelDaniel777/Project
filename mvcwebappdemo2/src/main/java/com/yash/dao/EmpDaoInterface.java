package com.yash.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EmpDaoInterface<T> {
	boolean saveData(T ob);
	boolean updateData(T ob);
	boolean deleteData(T ob);
	T get(int id);
	
}
