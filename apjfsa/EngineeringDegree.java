package com.apjfsa;

class Graduation {
    
	String courseName;
    int no_ofYears;
    int courseFee;

    public Graduation(String courseName, int no_ofYears) {
       
    	this.courseName = courseName;
        this.no_ofYears = no_ofYears;
   
    }

    
    void courseDetails(int fee) {
        this.courseFee = fee;
        System.out.println("Course details: " + courseName + ", " + no_ofYears + " years \nFee: " + courseFee);
   
    }
}


class EngineeringDegree extends Graduation {
   
	String branchName;
    int no_ofSubjects;

    
    public EngineeringDegree(String courseName, int no_ofYears, String branchName, int no_ofSubjects) {
      
    	super(courseName, no_ofYears);
        this.branchName = branchName;
        this.no_ofSubjects = no_ofSubjects;
    
    }

    
    @Override
    void courseDetails(int fee) {
        super.courseDetails(fee);
        System.out.println("\nEngineering Degree details: " + branchName + ", " + no_ofSubjects + " subjects \nFee: " + courseFee);
    }

    
    public static void main(String[] args) {
        EngineeringDegree btech = new EngineeringDegree("Btech", 4, "CSE", 6);
        btech.courseDetails(20000);  // Specify the course fee here
    }
}
