package com.yash.regexdemo.buildhouse;

public class BuildHouse {
	int amountOfArea;
	String purchaseMaterials;
	String Architect;
	int hireWorkers;
	boolean confirm;
	boolean startWorking;
	static boolean stopWorking;
	boolean finish;
	
	
	@Override
	public String toString() {
		return "BuildHouse [amountOfArea=" + amountOfArea + ", purchaseMaterials=" + purchaseMaterials + ", Architect="
				+ Architect + ", hireWorkers=" + hireWorkers + ", confirm=" + confirm + ", startWorking=" + startWorking
				+ ", finish=" + finish + "]";
	}
	public int getAmountOfArea() {
		return amountOfArea;
	}
	public void setAmountOfArea(int amountOfArea) {
		this.amountOfArea = amountOfArea;
	}
	public String getPurchaseMaterials() {
		return purchaseMaterials;
	}
	public void setPurchaseMaterials(String purchaseMaterials) {
		this.purchaseMaterials = purchaseMaterials;
	}
	public String getArchitect() {
		return Architect;
	}
	public void setArchitect(String architect) {
		Architect = architect;
	}
	public int getHireWorkers() {
		return hireWorkers;
	}
	public void setHireWorkers(int hireWorkers) {
		this.hireWorkers = hireWorkers;
	}
	public boolean isConfirm() {
		return confirm;
	}
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	public boolean isStartWorking() {
		return startWorking;
	}
	public void setStartWorking(boolean startWorking) {
		this.startWorking = startWorking;
	}
	public static boolean isStopWorking() {
		return stopWorking;
	}
	public static void setStopWorking(boolean stopWorking) {
		BuildHouse.stopWorking = stopWorking;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	
	
	
		
		
	
}
