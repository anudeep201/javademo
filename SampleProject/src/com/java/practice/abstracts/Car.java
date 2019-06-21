package com.java.practice.abstracts;

public abstract class Car {

	public String carName = "Car";
	public String color;
	private int wheels = 4;
	public String fuelType;
	
	public Car() {}
	
	public String getCarName() {
		return carName;
	}
	
	public abstract void setColor(String color);
	
	public abstract void setFuelType(String fuelType);
	
	public String getColor() {
		return color;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public static void main(String[] args) {
		
	}
	
}
