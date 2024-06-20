package com.apjfsa;

// Base class representing a general bank account
class Account {
    
    
	// Instance variables to store account type and balance
    String accountType;
    double balance;

    
    // Constructor to initialize account type and set initial balance to 0.0
    public Account(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    
    // Method to deposit a specified amount into the account
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rupees :" + amount);
    }
    

    // Method to display the current balance of the account
    void displayBalance() {
        System.out.println("Current Balance: Rupees :" + balance);
    }
}


// Derived class representing a savings account which extends the general Account class
class SavingsAccount extends Account {
    
	
    // Instance variable to store the interest rate for the savings account
    double interestRate;

    
    // Constructor to initialize account type and interest rate
    public SavingsAccount(String accountType, double interestRate) {
        super(accountType);
        this.interestRate = interestRate;
    }

    
    // Method to calculate and add interest to the balance
    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: Rupees :" + interest);
    }
}


// Main class to demonstrate the functionality of the Account and SavingsAccount classes
public class DemoBank {
	
	
    public static void main(String[] args) {
    	
    	
        // Create a new SavingsAccount object with a specified account type and interest rate
        SavingsAccount mySavings = new SavingsAccount("Savings", 2.5);
        
        // Deposit an amount into the savings account
        mySavings.deposit(1000);
        
        // Add interest to the savings account
        mySavings.addInterest();
        
        // Display the current balance of the savings account
        mySavings.displayBalance();
    }
}
