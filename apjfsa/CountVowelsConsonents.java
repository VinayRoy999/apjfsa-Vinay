package com.apjfsa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountVowelsConsonents {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        
        // Input
        System.out.print("Enter string: ");
        
        // Read input & convert to lowercase for case-insensitivity
        String input = scanner.nextLine().toLowerCase();
        
        int spacecount = 0;
        
        int vowelCount = 0; // Initialize vowel count
        int consonantCount = 0; // Initialize consonant count

        // For Showing the No of Spaces btw words
        StringTokenizer token = new StringTokenizer(input, " ");
        
        spacecount = token.countTokens();
        
        
        
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
        	
        	
            // Get the current character
            char ch = input.charAt(i); 

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                
            	vowelCount++; 
            	// Increment vowel count

            }
           
            
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                
            	consonantCount++; 
            	// Increment consonant count
            }
        }

        
        // Print the total number of vowels and consonants
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Count of WordSpace" + spacecount);
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
