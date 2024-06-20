package com.apjfsa;

public class Lab4Shape {
  
	// Method for circle
    public double area(double radius) {
        
    	// Formula for  circle: π * r^2
        return Math.PI * radius * radius;
    }

    // Method for rectangle
    public double area(double length, double width) {
       
    	// Formula for rectangle: length * width
        return length * width;
    }

    // Method for triangle
    // diff bcz having a float parameter
    public double area(double base, float height) {
       
    	// Formula for triangle: 0.5 * base * height
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        
    	Lab4Shape shape = new Lab4Shape();
        
        System.out.println("Circle Area: " + shape.area(5.0));
        
        System.out.println("Rectangle Area: " + shape.area(4.0, 3.0));
        
        System.out.println("Triangle Area: " + shape.area(4.0, 5.0f));
    }
}
