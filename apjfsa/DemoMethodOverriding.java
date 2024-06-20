package com.apjfsa;


// Superclass
class Calculator {
   
	
	// Method to be overridden
    public double calculate(double a, double b) {
      
    	// addition
        return a + b;
    }
}



// Subclass
class AdvancedCalculator extends Calculator {
  
	
	// Overriding the calculate() method
  
	@Override
       public double calculate(double a, double b) {
      
    	// multiplication
        return a * b;
  
    }
}



public class DemoMethodOverriding {
    public static void main(String[] args) {
       
    	
    	// instance of Calculator
        Calculator basicCalculator = new Calculator();
        
        // instance of AdvancedCalculator
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        
       
        // addition
        System.out.println("Basic Calculator - Addition: " + basicCalculator.calculate(10, 20));
        
        // multiplication
        System.out.println("Advanced Calculator - Multiplication: " + advancedCalculator.calculate(10, 20));
        
        
        
        // For Demonstrating polymorphism
        Calculator polymorphicCalculator = new AdvancedCalculator();
        
        System.out.println("Polymorphic Calculator - Multiplication: " + polymorphicCalculator.calculate(10, 20));
   
    
    }
}
