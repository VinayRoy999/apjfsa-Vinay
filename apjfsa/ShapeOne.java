package com.apjfsa;
//
//public interface ShapeOne {
//	
//	
//	final float pi=3.14f;
//	
//	int area();
//	int perimeter();
//	default int surfacearea()
//	{
//		return 0;
//	}
//
//	static void msg()
//	{
//		System.out.println("Static Method");
//	}
//	
//	
//}



public interface ShapeOne {
	int area();
	int perimeter();
	default int surfacearea()
	{
		return 0;
	}
	static void msg() {
		System.out.println("INTERFACE IS WORKING");
	}
}