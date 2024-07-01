package com.newapjfsa;

import java.util.TreeMap;

// Class definition for a student
class StudentNew {
    int rollNumber;
    String name;
    String grade;

    // Constructor to initialize student details
    public StudentNew(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    // Overriding toString method to return a string representation of a student
    @Override
    public String toString() {
        return "StudentNew{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

// Main class to run the program
public class StudentMain {
    public static void main(String[] args) {
        
        // Creating a TreeMap to store students with their roll numbers as keys
        TreeMap<Integer, StudentNew> studentMap = new TreeMap<>();

        // Creating student objects
        StudentNew student1 = new StudentNew(101, "Arjun", "A");
        StudentNew student2 = new StudentNew(102, "Bala", "B");

        // Adding students to the TreeMap
        studentMap.put(student1.rollNumber, student1);
        studentMap.put(student2.rollNumber, student2);

        // Accessing and printing student details by roll number
        StudentNew retrievedStudent = studentMap.get(101); // Accessing student with roll number 101
        System.out.println(retrievedStudent);

        StudentNew retrievedStudent1 = studentMap.get(102); // Accessing student with roll number 102
        System.out.println(retrievedStudent1);
    }
}
