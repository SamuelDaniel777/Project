package com.yash.carproblem.model;

public class CarData {
	
	int regNumber;
	String ownerName;
	String type;
	String engineType;
	String carType;
	
	public CarData() {
		
	}
	
	public CarData(int regNumber, String ownerName, String type, String engineType, String carType) {
		super();
		this.regNumber = regNumber;
		this.ownerName = ownerName;
		this.type = type;
		this.engineType = engineType;
		this.carType = carType;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "CarData [regNumber=" + regNumber + ", ownerName=" + ownerName + ", type=" + type + ", engineType="
				+ engineType + ", carType=" + carType + "]";
	}
	
}
