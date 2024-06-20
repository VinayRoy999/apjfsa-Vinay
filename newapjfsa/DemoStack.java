package com.newapjfsa; // Package name

import java.util.ArrayList; // Import ArrayList
import java.util.Stack; // Import Stack

public class DemoStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); // Initialize Stack

        ArrayList<Integer> arraylist = new ArrayList<>(); // Initialize ArrayList

        stack.push(10); // Push 10
        stack.add(20);  // Add 20
        stack.push(30); // Push 30
        stack.push(50); // Push 50

        System.out.println(stack); // Print stack: [10, 20, 30, 50]

        System.out.println(stack.pop()); // Pop and print: 50

        System.out.println(stack.peek()); // Peek and print: 30

        System.out.println(stack.search(20)); // Search 20, print position: 2
    }
}
