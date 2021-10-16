package com.demo.test;

public class Section {
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
	
	public String showSectionDetail(){
		id = 101;
		name = "core_java";
		createdDate = "31-01-2017";
		return id+name+createdDate;
	}
		
	
	
	
}
