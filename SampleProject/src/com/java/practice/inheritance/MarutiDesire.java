package com.java.practice.inheritance;

public class MarutiDesire extends Car {
	
	public String getCarName() {
		carName = "Maruti Desire";
		return carName;
	}
	
	public void callSuperAndChildMethodName() {
		System.out.println("Car name : " + super.getCarName());
		System.out.println("Child car name : " + getCarName());
	}
	
	public static void main(String[] args) {
		MarutiDesire maruti = new MarutiDesire();
		maruti.setColor("Red");
		maruti.setFuelType("Diesel");

		maruti.callSuperAndChildMethodName();
		System.out.println();
		System.out.println("Car name : " + maruti.getCarName());
		System.out.println("Color of the car is : " + maruti.getColor());
		System.out.println("Wheels in car : " + maruti.getWheels());
		System.out.println("Fuel type for the car : " + maruti.getFuelType());
		
	} 
	
}
