package com.apjfsa;

public interface VehicleNew {
	
	
	int getNumberOfWheels();
	int getCapacity();
	
	String getFuelType();
	
	static void msg() {
		System.out.println("Vehicle interface Working");

	}
}