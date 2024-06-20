package com.apjfsa;

public class ArrayRotation {


	
	public static void main(String[] args) {

		
		// Taking array elements
		  int[] arr = {1, 3, 5, 7, 9, 11};
	      
		  
		  // taking variable for taking length
		  int n = arr.length;
		  
		  
		  // Create a new array to store the rotated elements
	      int[] rotatedArr = new int[n];

	      
	      //reverse the elements
	        for (int i = 0; i < n; i++) {
	            
	        	
	            //element from end of the 1st array to the start the new array
	        	rotatedArr[i] = arr[n - 1 - i];
	       
	        }

	       
	        
	        // Display the rotated array
	        for (int num : rotatedArr) {
	            System.out.print(num + " ");
	            
	        
	        }
		    
		    }
		
	}


