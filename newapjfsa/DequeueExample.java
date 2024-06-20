package com.newapjfsa;

import java.util.Deque; // Import Deque interface
import java.util.LinkedList; // Import LinkedList class

public class DequeueExample { 
    public static void main(String[] args) { 
    	
    	  // Create a Deque
        Deque<String> deque = new LinkedList<>(); 
      

        deque.add("Element 1"); // Add element at the end
        deque.addFirst("Element 2"); // Add element at the beginning
        deque.addLast("Element 3"); // Add element at the end

        
        // Print Deque
        System.out.println("Deque Elements: " + deque); 

        
        // Get first element
        System.out.println("First Element: " + deque.getFirst()); 
       
       
        // Get last element
        System.out.println("Last Element: " + deque.getLast()); 
       

        
    }
}
