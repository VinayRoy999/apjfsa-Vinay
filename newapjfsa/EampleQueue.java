package com.newapjfsa;
import java.util.PriorityQueue;

public class EampleQueue {
	
    public static void main(String[] args) {
       
    	// Creating a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the Priority Queue
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(1);

        // Removing elements from the Priority Queue
        while (!pq.isEmpty()) {
        	
            System.out.println(pq.poll());
        }
    }
}
