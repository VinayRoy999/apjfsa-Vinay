package com.apjfsa;

import java.util.Scanner;

public class ReplaceChar2 {

    public static void main(String[] args) {
        
        System.out.print("Enter a string: ");
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // Convert the string to a character array
        char[] arr = str.toCharArray();
        
        // Determine the length of the string
        int length = str.length();
        
        // Mask all but the last four characters
        for (int i = 0; i < length - 4; i++) {
            arr[i] = 'X';
        }
        
        // Convert the character array back to a string
        String maskedString = new String(arr);
        
        // Print the masked string
        System.out.println("Masked output: " + maskedString);
        
        // Close the Scanner
        sc.close();
    }
}
