package com.demo.test;

public class Category {
	private int id;
	private String name;
	private String createdDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public String showCategoryDetail() {
		id = 101;
		name = "javabasics";
		createdDate = "31-01-2017";
		
		
		return id+name+createdDate;
	}
	
}
