package com.apjfsa;

public class SquareCube {
	
    public static void main(String[] args) {
        
        // Initialize an array with the numbers
        int[] numbers = {2, 3, 4};

        // Iterate over each number in the array
        for (int num : numbers) {
        
            // Calculate the square of the current number
            int square = num * num;
           
            // Print the result of the square calculation
            System.out.println("Square of " + num + " is = " + square);

            // Calculate the cube of the current number
            int cube = num * num * num;
            
            // Print the result of the cube calculation
            System.out.println("Cube of " + num + " is = " + cube);
        
        }
    }
}
