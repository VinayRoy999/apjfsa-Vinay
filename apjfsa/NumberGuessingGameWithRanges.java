package com.apjfsa;

// Import Random class for generating random numbers
import java.util.Random;

import java.util.Scanner;

public class NumberGuessingGameWithRanges {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); // Scanner for reading user input
        
        Random random = new Random(); // Random number generator
        
        
        
      //Initialization:
        //
        //The game starts by setting the initial range (lowerBound and upperBound).
        //A random number (secretNumber) is generated within this range.
        //A counter (attempts) is initialized to track the number of guesses.
        //
        //
        
        
        int lowerBound = 1; // Initial lower bound
        int upperBound = 50; // Initial upper bound
        
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound; 
        // Generate secret number
       
        
        int attempts = 0; // Track number of attempts
        boolean guessedCorrectly = false; // Track if the number is guessed

        System.out.println("Welcome to the Number Guessing Game with Ranges!");
        System.out.println("Try to guess the secret number between " + lowerBound + " and " + upperBound + ".");

        
        
       
        
      //Game Loop:
        //
        //The loop continues until the player guesses the number correctly.
        //The current range is displayed to the player.
        //The player enters a guess.
        //The game checks if the guess is within the current range. If not, it prompts the player to guess within the correct range.
        //The guess is compared to the secretNumber.
        //If the guess is too low, the lowerBound is updated to the guess + 1.
        //If the guess is too high, the upperBound is updated to the guess - 1.
        //If the guess is correct, the game ends and congratulates the player, displaying the number of attempts.
        //
        //
      
        while (!guessedCorrectly) {
        	
            System.out.println("Range: [" + lowerBound + ", " + upperBound + "]");
            
            System.out.print("Enter your guess: ");
            
            int guess = scanner.nextInt(); // Read player's guess
            attempts++; // Increment attempts

            // Check if the guess is outside the current range
            if (guess < lowerBound || guess > upperBound) {
                System.out.println("Please guess a number within the current range!");
               
                continue; // Skip to the next iteration
            }

            // Check if the guess is too low
            if (guess < secretNumber) {
                System.out.println("Too low!");
              
                lowerBound = Math.max(lowerBound, guess + 1); // Update lower bound
            }
            // Check if the guess is too high
            else if (guess > secretNumber) {
            	
                System.out.println("Too high!");
              
                upperBound = Math.min(upperBound, guess - 1); // Update upper bound
            }
            
            
            
          //Ending the Game:
            //
            //The game ends when the player guesses the secretNumber.
            //The total number of attempts taken is displayed.

      
            // Guess is correct
            else {
                guessedCorrectly = true;
              
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly.");
                System.out.println("Number of attempts: " + attempts);
            }
        }

        scanner.close();   
        
    }
    
}


































