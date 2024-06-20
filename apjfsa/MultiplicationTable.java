package com.apjfsa;

import java.util.Scanner;

public class MultiplicationTable {

   
	
	public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);

        
   
   
   
   // enter the number for table
       
   
   System.out.println("Enter the number:");
       
        
        int number = scanner.nextInt();

        
        
        
        // Printing the table for the given number
        
        
     System.out.println("Multiplication table for " + number + ":");
        
        
        for (int i = 1; i <= 10; i++) 
        
        {
           
     System.out.println(number + " x " + i + " = " + (number * i));
       
        
        }
   
    
    
    }
}

