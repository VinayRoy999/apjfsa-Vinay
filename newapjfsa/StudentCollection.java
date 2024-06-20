package com.newapjfsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    
    int studentId;         // Student ID
    String studentName;    // Student Name
    String qualification;  // Student Qualification

    // Constructor with parameters to initialize student properties
    public Student(int studentId, String studentName, String qualification) {
        super();
        this.studentId = studentId;          // Set student ID
        this.studentName = studentName;      // Set student name
        this.qualification = qualification;  // Set student qualification
    }

    // Override toString method to provide a string representation of the student object
    @Override
    public String toString() {
        return "Student ID: " + studentId + 
               ", Name: " + studentName + 
               ", Qualification: " + qualification;
    }

    // Override compareTo method to compare students by their names
    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);
    }
}

public class StudentCollection {

    public static void main(String[] args) {

        // Create a list to hold Student objects
        List<Student> list = new ArrayList<>();

        // Add new Student objects to the list
        list.add(new Student(1, "Arjun", "B.Sc"));
        list.add(new Student(2, "Balu", "M.Sc"));
        list.add(new Student(3, "Charan", "PhD"));
        
        // Add another Student object
        Student s = new Student(4, "Ravi", "MBBS");
        list.add(s);

        // Iterate over the list and print each student's details
        System.out.println("Original list:");
        for (Student student : list) {
            System.out.println(student);
        }

        // Find and print the student with the "maximum" name (lexicographically highest)
        System.out.println("\nStudent with the maximum name: " + Collections.max(list));

        // Sort the list of Students
        Collections.sort(list);

        // Print the sorted list
        System.out.println("\nSorted list:");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
