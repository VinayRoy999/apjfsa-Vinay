package com.apjfsa;

public class TravelBus implements VehicleNew {
	
	int numberOfWheels;
	int capacity;
	String fuelType;
	
	// Constructor with parameters
	public TravelBus(int numberOfWheels, int capacity, String fuelType) {
		this.numberOfWheels = numberOfWheels;
		this.capacity = capacity;
		this.fuelType = fuelType;
	}

	@Override
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	@Override
	public int getCapacity() {
		return capacity;
	}

	@Override
	public String getFuelType() {
		return fuelType;
	}

	public static void main(String[] args) {
		TravelBus bus = new TravelBus(6, 50, "Diesel");
		System.out.println("Number of Wheels = " + bus.getNumberOfWheels());
		System.out.println("Capacity = " + bus.getCapacity());
		System.out.println("Fuel Type = " + bus.getFuelType());
		
		VehicleNew.msg();
	}
}
