/*
 * Programming Challange 9.1: Backward String
 * Date of Last Modification: 03/20/2025
 * 
 * Purpose: This program prompts the user for a
 *          text input, passes that input to a 
 *          method to be reversed, and displays 
 *          the results.
 * 
 * Assumptions:
 * - The user will enter a valid line of text.
 * - The program outputs the reversed string to the console.
 * - There are no known bugs or issues.
 */

import java.util.Scanner;

public class BackwardString {

    /**
     * Main method to prompt the user for a string input.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {

        // Declares a variable to store the user input.
        String input;

        // Creates a Scanner object to read user input.
        try (Scanner keyboard = new Scanner(System.in)) {

            // Prompts the user for a word.
            System.out.print("Please enter a word: ");

            // Reads the user input.
            input = keyboard.nextLine();
        }

        // Checks if the input is blank.
        if (input.isBlank()) {

            // If the input is blank, display an error message.
            System.out.println("Invalid Input.");
        } else {

            // Calls the reverseString method to reverse the user input.
            reverseString(input);
        }
        
    }

    /**
     * Reverses the input string and prints the result.
     * @param input The original string (text) to be reversed.
     */
    public static void reverseString(String input) {
        System.out.print("Reversed: ");

        // Utilizes a for loop to reverse the input string.
        for (int i = input.length() - 1; i >= 0; i--) {

            // Prints the character at the current index.
            System.out.print(input.charAt(i));
        }     
    }
}
