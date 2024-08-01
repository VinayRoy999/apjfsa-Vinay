package revision;

public class ConditionalStatements {
   
	public static void main(String[] args) {
        
    	
    	int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        
        
        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } 
        else {
            System.out.println("The number is odd.");
        }

        
        // if-else-if ladder
        if (number > 0) {
            System.out.println("The number is positive.");
        } 
        
        else if (number < 0) {
            
        	System.out.println("The number is negative.");
        } 
        else {
            System.out.println("The number is zero.");
        }

        
        
        
        // switch statement
        int day = 3;
        
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day: " + dayName);
    }
}
