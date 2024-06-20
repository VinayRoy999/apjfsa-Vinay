package com.apjfsa;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Daily withdrawal limit
        int dailyLimit = 1000000; 
        
     // Total amount withdrawn so far
        int totalWithdrawn = 0; 
        
        // Assuming PIN code is 1234
        int pinCode = 1234;
        
        while (true) {
            System.out.print("Enter amount to withdraw (0 to exit): ");
            int amount = scanner.nextInt();
            
            
         // Exit the loop if 0 is entered

            if (amount == 0) {
                System.out.println("Exiting...");
                break;
            }
            
            
            System.out.print("Enter PIN code: ");
            int enteredPin = scanner.nextInt();
            
            
         // Ask for PIN again if incorrect
            if (enteredPin != pinCode) {
                System.out.println("Incorrect PIN code. Please try again.");
                continue; 
            }
            
            
            
            
            
            // condition to check If the sum of totalWithdrawn and 
            // amount is greater than dailyLimit
            

            if (totalWithdrawn + amount > dailyLimit) {
                System.out.println("Daily withdrawal limit reached. Exiting...");
                break; // Exit the loop if daily limit is reached
            }
            
            
            
            
            //adding amount for every transaction to withdrawal

            totalWithdrawn += amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Total withdrawn today: " + totalWithdrawn);
        }
        
        
        
        //for cleaning up

        scanner.close();
    }
}
