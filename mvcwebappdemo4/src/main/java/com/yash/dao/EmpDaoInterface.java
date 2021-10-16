package com.yash.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;

@Repository
public interface EmpDaoInterface extends JpaRepository<Employee, Integer>{

}
