package com.apjfsa;

import java.util.Scanner;

public class RevString {
    
    public static void main(String[] args) {
        
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Enter a string
        System.out.print("Enter a string to reverse: ");
        
        // Read the user input
        String original = scanner.nextLine();
        
        // Creating char array to hold the reversed string
        char[] reversedArray = new char[original.length()];
        
        // Fill reversedArray with characters from original in reverse order
        for (int i = 0; i < original.length(); i++) {
        	
            reversedArray[i] = original.charAt(original.length() - 1 - i);
        }
        
        // Convert the reversed char array to a string
        String reversedString = new String(reversedArray);
        
        // Print the original string
        System.out.println("Original: " + original);
        
        // Print the reversed string
        System.out.println("Reversed: " + reversedString);
        
        // Close the scanner 
        scanner.close();
    }
}
