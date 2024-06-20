package com.apjfsa;

public class MinMaxArray {

	public static void main(String[] args) {

		
		// array for elements
		int[] arr = {412, 765, 234, 999, 10};
		
		// initialize min and max
		int min = arr[0];
		int max = arr[0];

		
		// array for assuming the values
		for (int i = 1; i < arr.length; i++) {
		  
			
			// condition for min
			if (arr[i] < min) {
		        min = arr[i];
		    }
		 
			// condition for max
		    if (arr[i] > max) {
		        max = arr[i];
		    
		    }
		}

		
		// printing the values here
		System.out.println("Min value: " + min);
		System.out.println("Max value: " + max);
		
		
	}

}
