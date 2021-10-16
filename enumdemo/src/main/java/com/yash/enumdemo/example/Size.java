package com.yash.enumdemo.example;

enum Size {
	SMALL("small size"),
	MEDIUM("medium size"),
	LARGE("Large size");
	
	String selectSize;
	private Size(String selectSize) {
		this.selectSize=selectSize;
	}
	
}
