package com.apjfsa;
import java.util.Scanner;



public class Lab6StudentMarks {

    public static void main(String[] args) {
        
    	
    	
    	// for reading inputs
    	Scanner scanner = new Scanner(System.in);

    	
        // Array of student marks
        int marks[] = new int[6];
        
        System.out.println("Enter the marks for 6 subjects:");
        
        

        //loop for adding sub marks
        for (int i = 0; i < marks.length; i++) {
        	
            System.out.print("Subject " + (i + 1) + ": ");
            
            marks[i] = scanner.nextInt();
            
        }
        
        
       
 //----------------------------------------------------------------
        
        
        
        
        int totalMarks = 0; // Initialize total marks to 0
        
        boolean F = false; // Initialize failure variable to false
        
        
        // Calculate total marks and check for failing marks
        for (int mark : marks) {
        	
        	// adding marks with each other to get total marks
            totalMarks += mark;
            
            
         // Assuming 36 as the passing mark for each subject
            if (mark < 36) { 
            	
            	F = true;
               
            	// Exits loop if failed in 1 subject
            	break; 
            
            }
        }

        
        
//----------------------------------------------------------------------------        
        
        
        
        // Determine result based on total marks and failure flag
        String result = (totalMarks >= 250 && !F) ? "Pass" : "Fail";

        
        
        // Calculate percentage of total marks
        double percentage = ((double) totalMarks / (marks.length * 100)) * 100;

        
        
        // Print total marks, result, and percentage
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Result: " + result);
        System.out.println("Percentage: " + percentage + "%");
    
   
    
    
    }
}
