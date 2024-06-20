package com.apjfsa;

public class Car extends Vehicle{

	
	String model;
	String fuel;
	String color;
	
	
	void carDetails() {
		System.out.println("Car Details : " + model + " " + fuel + " " + color) ;
	}
	
	public static void main(String[] args) {
		

		Car benz = new Car();
		benz.name= " Benz Car";
		benz.no_of_whlees=4;
		benz.speed=300;
		benz.model="S-Class";
		benz.fuel="Petrol";
		benz.color="Red";
				
		
		
	}

}
