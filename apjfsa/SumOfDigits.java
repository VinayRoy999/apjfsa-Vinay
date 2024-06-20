package com.apjfsa;


public class SumOfDigits {
   
	
	// Method to calculate the sum of digits until a single digit is obtained
    public static int calculateSingleDigitSum(int number) {
       
    	
    	// Loop until the number is reduced to a single digit
        while (number > 9) {
            
        	
        	// Initialize the sum for the current iteration
        	int sum = 0; 
           
        	
            // Calculate the sum of digits of the current number
            while (number != 0) {
            	
            	
            	// Add the last digit of the number to the sum
            	sum += number % 10; 
               
            	// Remove the last digit from the number
            	number /= 10; 
            }
            
            
            // Update the number with the sum of its digits
            number = sum;
        }
        
        
        // Return the single-digit result
        return number;
    }

    
    
    
    public static void main(String[] args) {
        
    	
    	// Initialize the number to be processed
    	int num = 6365326; 
        
    	// Calculate the single digit sum
    	int result = calculateSingleDigitSum(num); 
      
        
        // Print the result
        System.out.println("Sum of digits of " + num + " until single digit: " + result);
   
    }
}
