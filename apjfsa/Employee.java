package com.apjfsa; // Declares the package name

public class Employee {

    int empID;        // Employee ID
    String empName;   // Employee Name
    int Salary;       // Employee Salary

    // No-args Constructor
    Employee() {
        System.out.println("Employee Object Created");
    }

    // Constructor with parameters for ID, name, and salary
    Employee(int id, String n, int s) {
        empID = id;   // Set employee ID
        empName = n;  // Set employee name
        Salary = s;   // Set employee salary
    }

    // Constructor with parameters for ID and name
    Employee(int id, String n) {
        empID = id;   // Set employee ID
        empName = n;  // Set employee name
        // Salary not initialized, defaults to 0
    }

    // Method to display employee information
    void empInfo() {
        System.out.println("Employee Details: " + empID + 
                           "\nName: " + empName + 
                           "\nSalary: " + Salary);
    }

    public static void main(String[] args) {
        // Create an Employee object using the no-args constructor
        Employee emp = new Employee();
        // Set properties for the employee
        emp.empID = 123;
        emp.empName = "Ram";
        emp.Salary = 500000;
        // Display employee information
        emp.empInfo();

        // Create an Employee object using the constructor with ID and name
        Employee emp2 = new Employee(2, "Krishna");
        // Display employee information
        emp2.empInfo();

        // Create an Employee object using the constructor with ID, name, and salary
        Employee emp1 = new Employee(1211, "Ravi", 60000);
        // Display employee information
        emp1.empInfo();
    }
}
