package com.apjfsa;

import java.util.Scanner; 

public class RemovingVowels {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        // Create a Scanner object
        
        // input
        System.out.print("Enter a string: "); 
       
        // Read the input string
        String input = scanner.nextLine(); 
       
        
        // Remove all vowels (both lowercase and uppercase) from the input string
        String result = input.replaceAll("[aeiouAEIOU]", "");
        
        // string without vowels
        System.out.println("String without vowels: " + result);
    }
}
