package com.apjfsa;

public class StudentInfo {
  
	
	int rollNo;
    String name;
    String course;
    String className;

    public void studentDetails() 
    {
    
    	
    	System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Class: " + className);
   
    
    }

    public static void main(String[] args) 
    {
      
    	StudentInfo student = new StudentInfo();
        
        
        
        student.rollNo = 44;
        student.name = "RAM";
        student.course = "MCA";
        student.className = "SECTION A";

        student.studentDetails();
   
    
    
    }
}
