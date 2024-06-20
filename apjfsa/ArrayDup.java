package com.apjfsa;

public class ArrayDup {
	
    public static void main(String[] args) {
       
    	// Initialize the array with duplicate elements
    	int[] arr = {4, 2, 4, 5, 2, 3, 1, 6, 5}; 
       
    	
    	// Array to store counts of duplicates
    	int[] count = new int[arr.length]; 

    	  // Loop for each element in the array
        for (int i = 0; i < arr.length; i++) {
            
        	// Compare the current element with
        	for (int j = i + 1; j < arr.length; j++) {
               
        		
    			// Check if elements are the same
        		if (arr[i] == arr[j]) { 
                  
        			
        			// Increment count if duplicate found
        			count[i]++; 
                }
            }
        }

        
        // Loop to count array to print duplicates
        for (int i = 0; i < arr.length; i++) {
           
        	
    		// If the element has duplicates
        	if (count[i] > 0) { 
              
        		
        		// Print element and count
        		System.out.println(arr[i] + " is there " + (count[i] + 1) + " times."); 
                
        		
        		// Reset count to avoid reprinting
        		count[i] = 0; 
           
        	}
        }
    }
}
