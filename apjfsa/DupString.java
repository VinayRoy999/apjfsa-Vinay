package com.apjfsa;

import java.util.Scanner;

public class DupString {
	
    public static void main(String[] args) {
    	
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        
        String input = scanner.nextLine(); // Read the entire line of input
        
        // Initialize an array to keep track of character counts
        // The size 256 is chosen to cover all ASCII characters
        int[] count = new int[256];
        
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
        	
          
        	// Get the character at the current position
            char ch = input.charAt(i); 
            
            
            // Increment the count for this character in the array
            count[ch]++; 
      
        }
        
        // Print out the duplicate characters and their counts
        System.out.println("Duplicate characters and their counts:");
        
        
        for (int i = 0; i < 256; i++) {
        	
            if (count[i] > 1) { // Check if the character appears more than once
            	
                // Print the character and its count
                System.out.println((char) i + " - " + count[i]);
            }
        }
    }
}
