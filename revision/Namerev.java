package revision;

public class Namerev {

    // Method to reverse the given name
    public static String reverseName(String name) {
       
    	
        // Get the length of the name
        int length = name.length();  
        
       // Array to store reversed characters
        char[] reversedCharArray = new char[length];  
        
        
        // Loop to reverse the characters
        for (int i = 0; i < length; i++) {
        	
            reversedCharArray[i] = name.charAt(length - 1 - i);  
        }

        
        // Convert char array to String and return
        return new String(reversedCharArray);  
    }

    public static void main(String[] args) {
        
    	
        String name = "Vinay";  // Input name
      
        
        // Call the reverse method
        String reversedName = reverseName(name);  
        
        
        // Print the reversed name
        System.out.println("Reversed Name: " + reversedName);  
    }
}
