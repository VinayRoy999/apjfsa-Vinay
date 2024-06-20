package com.apjfsa;
import java.util.Scanner;

public class DemoATM {

    public static void main(String[] args) {
        int ACbalance = 120000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Demo ATM");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Check balance");
            System.out.println("4. Quit");

            System.out.println("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Enter amount to withdraw: ");
                int withdrawAmount = sc.nextInt();
                
                
                if (withdrawAmount > ACbalance) {
                    System.out.println("Insufficient funds!");
                } else {
                    
                	
                	// Ask for PIN after entering amount
                    System.out.println("Enter your PIN code: ");
                    int pinCode = sc.nextInt();
                    
                    // Assuming PIN code is correct
                   // Change 1234 to your desired PIN code
                    if (pinCode == 1234) { 
                        ACbalance -= withdrawAmount;
                        System.out.println("Amount withdrawn: " + withdrawAmount);

                        // Ask if the user wants a receipt
                        System.out.println("Do you want to print a receipt? (1. Yes, 2. No)");
                        int receiptChoice = sc.nextInt();
                        if (receiptChoice == 1) {
                            System.out.println("Printing receipt...");
                            // receipt message
                            System.out.println("Date: 2024-05-15");
                            System.out.println("Amount withdrawn: " + withdrawAmount);
                            System.out.println("Remaining balance: " + ACbalance);
                        }

                        // Ask if the user wants to display remaining balance or exit
                        System.out.println("1. Display remaining balance");
                        System.out.println("2. Exit");
                        int remainingBalanceChoice = sc.nextInt();
                        if (remainingBalanceChoice == 1) {
                            System.out.println("Your remaining balance: " + ACbalance);
                        } else {
                            System.out.println("Thank you for using Demo ATM.....");
                            return;
                        }
                    } else {
                        System.out.println("Incorrect PIN code! Please try again.");
                    }
                }
                break;

                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    ACbalance += depositAmount;
                    System.out.println("Amount deposited: " + depositAmount);
                    break;

                case 3:
                    System.out.println("Your account balance: " + ACbalance);
                    break;

                case 4:
                    System.out.println("Thank you for using Demo ATM.... :-)");
                    //return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
