package com.apjfsa;

public class DemoMethodOverLoading {

	

	// Method to calculate the average of single integer 
	public static double average(int num) {
		return num;
	}
	
	
	// Method to calculate the average of two integers
	public static double average(int num1, int num2) {
		return (num1 + num2) / 2;
	}

	
	// Method to calculate the average of three integers
	public static double average(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;
	}
	
	
	// Method to calculate the average of four integers
	public static double average(int num1, int num2, int num3, int num4) {
		return (num1 + num2 + num3 + num4) / 4.0;
	}
	

	// Method to calculate the average of two doubles
	public static double average(double num1, double num2) {
		return (num1 + num2) / 2;
	}

	// Method to calculate the average of an array of integers
	public static double average(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return (double) sum / numbers.length;
	}

	
	public static void main(String[] args) {
		
		// Average methods directly in print statements
		System.out.println("Avg of a single integer: " + average(10));
		System.out.println("Avg of two integers: " + average(10, 20));
		System.out.println("Avg of three integers: " + average(10, 20, 30));
		System.out.println("Avg of four integers: " + average(10, 20, 30, 40));
		System.out.println("Avg of two doubles: " + average(10.5, 20.5));
		System.out.println("Avg of an array of integers: " + average(new int[]{10, 20, 30, 40, 50}));
	}
}
