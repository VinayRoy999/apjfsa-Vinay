package com.newapjfsa;

import java.util.Deque; // Import Deque interface
import java.util.LinkedList; // Import LinkedList class

public class DequeueExample { 
    public static void main(String[] args) { 
    	
    	  // Create a Deque
        Deque<String> deque = new LinkedList<>();
        Deque<Integer> dequ = new LinkedList<>(); 

        
        dequ.push(20);
        dequ.push(50);
        dequ.push(30);
        dequ.push(50);

        System.out.println("Deque Int Elements: " + dequ);
        System.out.println(dequ.poll()); 
        System.out.println(dequ.peek()); 
        
        dequ.add(10);
        dequ.addFirst(5);
        dequ.addLast(100);
        System.out.println(dequ); 

        
     
        
  //---------------------------------------------------
        
        
        
        deque.add("Element 1"); // Add element at the end
        deque.addFirst("Element 2"); // Add element at the beginning
        deque.addLast("Element 3"); // Add element at the end
        
        // Print Deque
        System.out.println("\nDeque String Elements: " + deque); 

        
        // Get first element
        System.out.println("First Element: " + deque.getFirst()); 
       
       
        // Get last element
        System.out.println("Last Element: " + deque.getLast()); 
       

        deque.removeFirst(); // Remove first element
        deque.removeLast(); // Remove last element

        // Print Deque after removal
        System.out.println("Deque Elements after removal: " + deque); 
        
    }
}
