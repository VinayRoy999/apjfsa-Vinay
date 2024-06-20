package com.apjfsa;

public class RectangleOne implements ShapeOne {
	
	int length;
	int width;
	
	// Constructor with parameters length and width
	public RectangleOne(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public int area() {
		int area = length * width;
		return area;	
	}

	@Override
	public int perimeter() {
		int perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public int surfaceArea() {
		return 1; 
	}

	public static void main(String[] args) {
		RectangleOne rectangle = new RectangleOne(25, 15);
		int a = rectangle.area();
		System.out.println("Area = " + a);
		System.out.println("Perimeter = " + rectangle.perimeter());
		System.out.println("Surface Area = " + rectangle.surfaceArea());
		
		ShapeOne.msg();
	}
}
