package com.apjfsa;

 class Student {

    int id;
    String name;
    int age;

    // Constructor to initialize the Student object
    public Student(int id, String name, int age) {
     
    	super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
    // Overriding the toString method to provide 
    //a custom string representation of the Student object
  
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

class JavaBatch {

    public static void main(String[] args) {
      
    	// Creating an array of Student objects with a capacity of 20
        Student[] std = new Student[20];

        // Initializing the first five Student objects in the array
        std[0] = new Student(1, "Ram", 20);
        std[1] = new Student(2, "Ravi", 21);
        std[2] = new Student(3, "Vinay", 22);
        std[3] = new Student(4, "Kanna", 23);
        std[4] = new Student(5, "Arjun", 24);

        
        int i;
        // Iterating through the array and printing the details of each Student
        for (Student student : std) {
        	
        	// Ensure only initialized Students are printed
            if (student != null) { 
            	
                System.out.println(student);
            }
        }
    }
}
