package com.apjfsa;

import java.util.Scanner;


public class ArraySearch {
	
    public static void main(String[] args) {
       
    	
    	
    	// Initialize an array with some integer elements
    	int[] array = {1, 2, 3, 4, 5};
       
                                                                                                    	
        // read input from the user
    	Scanner scanner = new Scanner(System.in);
        
    	
        // enter the element to search for
        System.out.print("Enter the element to search: ");
       
        
        // Read the element input by the user
        int searchElement = scanner.nextInt();
        
        
        // Initialize a boolean variable to check if the element is found
        boolean found = false;
       
        
        
        // Iterate over each element in  array
        for (int num : array) {
           
            // Check if current array element = search element
        	if (num == searchElement) {
                
        		// If found.... set the found variable = true and break out of loop
                
        		found = true;
                
                break;
            }
        }
        
       


        
        
        // After loop.... check if the element found
        if (found) {
            
        	
        	// If found.... print a success msg
            System.out.println("Element found in the array...");
      
        } 
        
        
        else {
         
        	// If not found... print a failure msg
            System.out.println("Element not found in the array...");
        }
    }
}