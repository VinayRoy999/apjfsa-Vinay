package com.apjfsa;


//
//public class Circle {
//	
//  double radius;
//
//  // Constructor to set the radius
//  public Circle(double radius) {
//      this.radius = radius;
//  }
//
//  // Method to calculate the area
//  public double area() {
//      return Math.PI * radius * radius;
//  }
//
//  // Method to calculate the perimeter (circumference)
//  public double perimeter() {
//      return 2 * Math.PI * radius;
//  }
//
//  public static void main(String[] args) {
//      Circle circle = new Circle(5); // Creating a circle with radius 5
//
//      // Printing the area and perimeter
//      System.out.println("Area: " + circle.area());
//      System.out.println("Perimeter: " + circle.perimeter());
//  }
//}





//Base class Shape
class Shape {
	
 double radius;

 
 
 // Constructor to set the radius
 public Shape(double radius) {
     this.radius = radius;
 }
}





//Derived or Main class Circle extending Shape
public class Circle extends Shape {

 // Constructor to set the radius
 public Circle(double radius) {
    
	// Call the constructor of the base class
	 super(radius); 
 }
 
 

 // Method to calculate the area
 public double area() {
     return Math.PI * radius * radius;
 }

 // Method to calculate the perimeter (circumference)
 public double perimeter() {
     return 2 * Math.PI * radius;
 }

 
 
 
 public static void main(String[] args) {
	 
	// Creating a circle with radius 5
     Circle circle = new Circle(5); 

     // Printing the area and perimeter
     System.out.println("Area: " + circle.area());
     System.out.println("Perimeter: " + circle.perimeter());
 }
}
