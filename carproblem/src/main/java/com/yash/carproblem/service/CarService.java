package com.yash.carproblem.service;

import com.yash.carproblem.model.CarData;

public interface CarService {
	
	void insertCarData(CarData cd);
	void showCarData();
	void updateCarData();
	void DeleteCarData(int regData);
	
	
}
