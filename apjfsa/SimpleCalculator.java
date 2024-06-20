package com.apjfsa;

import java.util.Scanner;

public class SimpleCalculator {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        double num1, num2, result;
        
        char operator;
        
        boolean continueCalculation = true;

        while (continueCalculation) {
        	
            // Read first number
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            // Read operator
            System.out.print("Enter operator +, -, *, /: ");
            operator = scanner.next().charAt(0);

            // Read second number
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Perform calculation based on operator
            switch (operator) {
            
                case '+':
                    result = num1 + num2;
                    System.out.println("Result of addition: " + result);
                    break;
                    
                case '-':
                    result = num1 - num2;
                    System.out.println("Result of subtraction: " + result);
                    break;
                    
                case '*':
                    result = num1 * num2;
                    System.out.println("Result of multiplication: " + result);
                    break;
                    
                case '/':
                	
                    if (num2 != 0) {
                    	
                        result = num1 / num2;
                        
                        System.out.println("Result of division: " + result);
                        
                    } 
                    
                    else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    
                    break;
                    
                default:
                    System.out.println("Invalid operator. Please use one of the following: +, -, *, /");
            }

            
            // user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? Yes or No: ");
            String userResponse = scanner.next().toLowerCase();
            
            if (!userResponse.equals("yes")) {
                continueCalculation = false;
            }
        }

        // Close the scanner
        scanner.close();
        System.out.println("Calculator closed.");
    }
}
