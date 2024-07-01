package com.newapjfsa;


import java.util.LinkedHashSet;

public class CityLinkedHashSetDemo {
    public static void main(String[] args) {
        // Initialize LinkedHashSet
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        
        // Add Indian cities
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        
        // Print all elements
        System.out.println("LinkedHashSet Elements: " + cities);
        
        // Check size
        System.out.println("Size: " + cities.size());
        
        // Remove an element
        System.out.println("Removing 'Delhi': " + cities.remove("Delhi"));
        System.out.println("After Removal: " + cities);
        
        // Add a new city
        cities.add("Chennai");
        System.out.println("After Adding 'Chennai': " + cities);
        
        // Check if an element exists
        System.out.println("Contains 'Mumbai'? " + cities.contains("Mumbai"));
    }
}
