package revision;

public class LoopsStatements {
    public static void main(String[] args) {
      
    	
    	
    	// for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop: " + i);
        }

        
        
        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("while loop: " + j);
            j++;
        }

        
        
        // do-while loop
        int k = 0;
        do {
            System.out.println("do-while loop: " + k);
            k++;
        } while (k < 5);

        
        
        // enhanced for loop
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println("enhanced for loop: " + number);
        }
    }
}
