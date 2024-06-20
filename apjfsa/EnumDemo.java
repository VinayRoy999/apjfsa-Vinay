package com.apjfsa; 

// Define an enumeration for different departments
enum Department {
    Accounts, // Represents the Accounts department
    Devops,   // Represents the DevOps department
    Testing,  // Represents the Testing department
    HR        // Represents the HR department
}

public class EnumDemo {

    public static void main(String[] args) {
        // Create an instance of the Department enum for Testing
        Department d = Department.Testing;
        // Create an instance of the Department enum for Accounts
        Department d1 = Department.Accounts;
        
        // Print the name of the Accounts department
        System.out.println(d1);

        // Compare the ordinal values of Testing and Accounts
        System.out.println(d.compareTo(d1));
        // Check if Testing is equal to Accounts
        System.out.println(d.equals(d1));
    }
}
