package com.java.practice.inheritance;

public class Car {

	public String carName = "Car";
	public String color;
	private int wheels = 4;
	private String fuelType;
	
	public Car() {}
	
	public String getCarName() {
		return carName;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
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
		Car c = new Car();
		c.setColor("White");
		c.setFuelType("Petrol");
		
		System.out.println("Color of car is : " + c.getColor());
		System.out.println("Number of wheels in a car : " + c.getWheels());
		System.out.println("Fuel type for the Car : " + c.getFuelType());
	}
	
}
