package com.apjfsa;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
    	
        // ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Insert integer values into the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Retrieve elements using get(index) method
        System.out.println("Element at index 1: " + numbers.get(1));

        // Retrieve the last element using get(size()-1) method
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));
    }
}
