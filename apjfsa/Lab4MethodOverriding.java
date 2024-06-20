package com.apjfsa;


// Base abstract class for NewEmployee
abstract class NewEmployee {
    
	
	
    // Abstract method to calculate total salary for an employee
    public abstract void calculateTotalSalary();
}



// Subclass for PermanentEmployee
class PermanentEmployee extends NewEmployee {
    
    // Overridden method to calculate total salary of permanent employee
    @Override
    public void calculateTotalSalary() {
        System.out.println("Calculating total salary for Permanent Employee");
    }
}



// Subclass for ContractEmployee
class ContractEmployee extends NewEmployee {
    
    // Overridden method to calculate total salary of contract employee
    @Override
    public void calculateTotalSalary() {
        System.out.println("Calculating total salary for Contract Employee");
    }
}

// Main class for implementation
public class Lab4MethodOverriding {
    
    public static void main(String[] args) {
        
        // Creating instances of PermanentEmployee and ContractEmployee
        NewEmployee permanentEmployee = new PermanentEmployee();
        
        NewEmployee contractEmployee = new ContractEmployee();
        
        
        
        // Calling calculateTotalSalary() for PermanentEmployee
        permanentEmployee.calculateTotalSalary(); 
        // Calculating total salary for Permanent Employee
        
        
        
        // Calling calculateTotalSalary() for ContractEmployee
        contractEmployee.calculateTotalSalary(); 
        //Calculating total salary for Contract Employee
    }
}
