package com.apjfsa;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
    	
    	Scanner scanner = new Scanner(System.in);

        // To Enter the range
        System.out.println("Enter the range :");
        int range = scanner.nextInt();

        // Initialize first two numbers
        int num1 = 0, num2 = 1;

        // Printing the first two numbers
        System.out.println("Fibonacci sequence:");
        System.out.print(num1 + " " + num2 + " ");

        // Fibonacci sequence for remaining numbers
        for (int i = 2; i < range; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");

            // Updating values for next 
            num1 = num2;
            num2 = num3;
        }
    }
}
