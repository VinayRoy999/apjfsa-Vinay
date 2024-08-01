package revision;

import java.util.Scanner;

public class LeapYear {
    
	public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        
        int year = input.nextInt();

        String result;
        
        switch (year % 4) {
           
        case 0:
                
        switch (year % 100) {
                    
        case 0:
                        
        switch (year % 400) {
                            
        case 0:
                                
        result = "Leap Year";
                                
        break;
                            
        default:
                                
        result = "Not a Leap Year";
                               
        break;
      
        }
                       
        break;
                    
        default:
                        
        result = "Leap Year";
                        
        break;
       
        }
               
        break;
           
        default:
               
        result = "Not a Leap Year";
               
        break;

        }

        System.out.println(result);
    }
}
