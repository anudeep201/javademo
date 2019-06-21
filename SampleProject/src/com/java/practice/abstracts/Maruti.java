package com.java.practice.abstracts;

public class Maruti extends Car {

	public String getCarName() {
		carName = "Maruti";
		return carName;
	}
	
	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public static void main(String[] args) {
		Maruti maruti = new Maruti();
		maruti.setColor("Blue");
		maruti.setFuelType("Electric");
		
		System.out.println("Car name is : " + maruti.getCarName());
		System.out.println("Car name is : " + maruti.getColor());
		System.out.println("Car name is : " + maruti.getFuelType());
	}

}
