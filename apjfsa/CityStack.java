package com.apjfsa; 

import java.util.Stack; // Import Stack class

class City {
    String name; // City name
    double literacyRate; // Literacy rate of the city

    // Constructor to initialize City object
    public City(String name, double literacyRate) {
        this.name = name;
        this.literacyRate = literacyRate;
    }
}

public class CityStack {
    public static void main(String[] args) {
        
        Stack<City> cityStack = new Stack<>(); // Stack to hold City objects

        // Push cities onto the stack
        cityStack.push(new City("HYD", 95.5)); // Push "HYD" with 95.5 literacy rate
        cityStack.push(new City("KNR", 88.3)); // Push "KNR" with 88.3 literacy rate
        cityStack.push(new City("SRCL", 92.1)); // Push "SRCL" with 92.1 literacy rate

        // Retrieve and print the top city
        City topCity = cityStack.peek(); // Get the top city
        System.out.println("Top City: " + topCity.name); // Print the name of the top city

        // Search for a city in the stack
        String searchCity = "KNR"; // City name to search for
        for (City city : cityStack) { // Iterate through the stack
            if (city.name.equals(searchCity)) { // Check if city name matches the search term
                System.out.println(searchCity + " found with literacy rate: " + city.literacyRate); // Print found city and its literacy rate
                break; // Exit loop after finding the city
            }
        }
    }
}