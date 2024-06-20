//package com.apjfsa;
//
//import java.util.Scanner;
//
//public class ReplaceChar {
//
//    public static String maskExceptLastFour(String input) {
//       
//    	// If the input length is 4 or less, return it as is
//        if (input.length() <= 4) {
//            return input;
//        }
//
//        // Create the masked part using 'X' characters and 
//        //append the last 4 characters of the input
//        return "X".repeat(input.length() - 4) + input.substring(input.length() - 4);
//    }
//
//    public static void main(String[] args) {
//    	
//        // Scanner object to read input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // enter a string
//        System.out.print("Enter a string: ");
//
//        // Read the input string
//        String input = scanner.nextLine();
//
//        // Test the method with the user's input
//        System.out.println("Masked string: " + maskExceptLastFour(input));
//
//        // Close the Scanner object
//        scanner.close();
//    }
//}