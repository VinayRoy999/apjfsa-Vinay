package com.apjfsa;

import java.util.Scanner;

//class for palindrome

public class PalindromeOne {

    public static void main(String[] args) {
      
    	//calling palindrome method in main
    	
    	Palindrome();
    
    }

    
    //declaring and implementing the method 
    public static void Palindrome() {
    	
    	//scanner for taking input
        Scanner scanner = new Scanner(System.in);
        
        //giving input
        System.out.println("Enter any number: ");
        int input = scanner.nextInt();
        
        //declaring variables here
        int temp = input, rem, rev = 0;

        
        // This loop will continue to execute as long as 
        //the input number is greater than 0.
        
        while (input > 0) {
        	
        	
        	//here we extract last digit and % gives remainder 
        	//bcz it is divided by 10
            rem = input % 10;
            
            
            // Build the reversed number by extracting the last digit
            rev = rev * 10 + rem;
            
            // Remove the last digit from input.. division by 10
            input /= 10;
      
        }

        
        // checks if the reversed number = the original number
        if (rev == temp) {
        	
            System.out.println("The number is a palindrome.");
        } 
        
        
        else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
