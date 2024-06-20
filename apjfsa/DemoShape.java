package com.apjfsa;

public abstract class DemoShape {

	
	String name;
	
	
	
	public DemoShape(String name) {
		super();
		this.name = name;
	}


	void shapeInfo()
	
	{
		System.out.println("Name of Shape = " + name);
	}
	
	
	abstract void areaOne();
	
		
	
}
