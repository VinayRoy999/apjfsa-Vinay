package com.apjfsa;

public class BoxOne {

    int length, breadth;
    
    void measurements() {
        System.out.println("Measurements of box: " + length + " , " + breadth);
    }
    
    // Static method to print measurements with given values
    static void printMeasurements(int length, int breadth) {
        System.out.println("Measurements of box: " + length + " , " + breadth);
    }

    public static void main(String[] args) {
        // Creating an object of Box class
        BoxOne b = new BoxOne();
        
        // Setting values for length and breadth
        b.length = 20;
        b.breadth = 10;
        
        // Calling the static method with values
        b.printMeasurements(b.length, b.breadth);
    }
}
