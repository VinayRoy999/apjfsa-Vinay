package com.newapjfsa; 
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args) {
        // Declare llist as List
        List<Double> llist = new LinkedList<Double>();

        // Add elements to the LinkedList
        llist.add(2000.03);
        llist.add(3005.35);
        llist.add(3205.05);
        llist.add(321.03);
        llist.add(302.35);

        // Print the LinkedList
        System.out.println(llist);  

        // Print the size of the LinkedList
        System.out.println(llist.size());  

        // Remove the first element from the LinkedList
        llist.remove(0);

        System.out.println( llist);  

        // Cast llist to LinkedList and push an element to the front
        ((LinkedList<Double>) llist).push(4302.32);

        // Print the LinkedList after pushing an element
        System.out.println( llist);

        // Find and print max and min elements
        System.out.println("Max: " + Collections.max(llist));
        System.out.println("Min: " + Collections.min(llist));

        // Sort the LinkedList
        Collections.sort(llist);
        System.out.println(llist);

        // Reverse the LinkedList
        Collections.reverse(llist);
        System.out.println(llist);

        // Iterate through the LinkedList and print each element
        Iterator<Double> itr = llist.iterator();
        System.out.println("Iterating through the list:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}