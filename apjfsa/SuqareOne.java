
package com.apjfsa;

public class SuqareOne implements ShapeOne {
	
	int side;
	
	//Constructor with parameter side
	public SuqareOne(int side) {
		//super();
		this.side = side;
	}

	@Override
	public int area() {
	  int area=side*side;
	  return area;	
	}

	@Override
	public int perimeter() {
		int perimeter=4*side;
		return perimeter;
		
	}
	
	public int surfacearea() {
		return 1;
	}

	public static void main(String[] args) {
       SuqareOne square=new SuqareOne(25);
       int a=square.area();
       System.out.println("Area="+a);
       System.out.println("Perimeter="+square.perimeter());
       System.out.println("Surface Area="+square.surfacearea());
       
       ShapeOne.msg();
  
	}

	

}