package com.apjfsa;



public class FizzBuzz {
    public static void main(String[] args) {
        
    	
    	// Loop through numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
          
        	
        	// Checking divisible by both 4 and 5
            if (i % 4 == 0 && i % 5 == 0) {
               
            	// If true, print "FizzBuzz"
                System.out.println("FizzBuzz");
           
                
            } 
            
            
         // Check if the current number is divisible by 4
            else if (i % 4 == 0) {
               
            	// If true, print "Fizz"
                System.out.println("Fizz");
          
            }
            
            
            // Check if the current number is divisible by 5
            else if (i % 5 == 0) {
                
            	// If true, print "Buzz"
                System.out.println("Buzz");
            } 
            
            
            else {
               
         // If none of the above conditions are true... print the current number
                System.out.println(i);
    
            }
        }
    }
}
