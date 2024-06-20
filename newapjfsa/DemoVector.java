package com.newapjfsa; 

import java.util.Vector; // Import Vector class

public class DemoVector {
    
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<String>(); // Create a Vector of Strings
        
        vector.add("Apple"); // Add elements to the Vector
        vector.add("Mango");
        vector.add("Orange");

        System.out.println(vector.firstElement()); // Print the first element
        System.out.println(vector.lastElement());  // Print the last element

        vector.add("Mango"); // Add duplicate element
        vector.addElement("Banana"); // Add another element
        vector.add(null); // Add a null element
        vector.add(5, "Grapes"); // Insert "Grapes" at index 5

        System.out.println(vector); // Print the entire Vector
        System.out.println("Current capacity: " + vector.capacity()); // Print the Vector's capacity
        
        // Modify the element at index 4 and print the replaced element before it
        String replacedElement = vector.set(4, "hi"); 
        System.out.println("Replaced element at index 4: " + replacedElement);
        System.out.println(vector); // Print the entire Vector after modification
    }
}
