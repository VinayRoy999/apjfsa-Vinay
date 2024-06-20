package com.apjfsa;

public class MergeArrays {
    public static void main(String[] args) {
      
    	int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {3, 5, 7, 9};
        
        int[] arr3 = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to arr3 starting at index 0
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        
        
        // Copy elements from arr2 to arr3 starting at 
        //the index after the last element of arr1
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        
        // Loop through the merged array arr3 and print each element
        for (int num : arr3) {
        	
            System.out.print(num + " ");
      
        }
    }
}
