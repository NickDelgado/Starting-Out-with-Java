/*
 * Programming Challange 9.3: Sentence Capitalizer
 * Date of Last Modification: 03/20/2025
 * 
 * Purpose: This program prompts the user for input, 
 *          passes that input to a method to capitalize
 *          the first letter of each word, and displays
 *          the results.
 * 
 * Assumptions: 
 * - The user will enter a valid line of text.
 * - Sentences are defined as ending with '.', '?', or '!'.
 * - The program outputs the capitalized sentence to the console.
 * - There are no known bugs or issues.
 */

import java.util.Scanner;

public class SentenceCaptializer {
    
    /**
     * Main method to prompt the user for input, calls the sentenceCap method, 
     * and displays the capitalized sentence.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        
        // Declares a variable to store the user input.
        String input;

        // Creates a Scanner object to read user input.
        try (Scanner keyboard = new Scanner(System.in)) {
            
            // Prompts the user for a sentence or phrase.
            System.out.print("Please enter one or more uncapitalized sentences: ");
            
            // Reads the user input.
            input = keyboard.nextLine();
            
            // Calls the sentenceCap method to capitalize the first letter of each word.
            System.out.println(sentenceCap(input));
        }
    }

    /**
     * Capitalizes the first letter of each word in a given string.
     * @param str The string to be capitalized.
     * @return The capitalized string.
     */
    public static String sentenceCap(String str) {
        
        // Declares a variable to track the current index.
        int i = 0;

        // Creates a StringBuilder object to modify the string.
        StringBuilder temp = new StringBuilder(str);

        // 
        if (temp.length() > 0)
            temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
        
        // Loops through the string to capitalize the first letter of each word.
        while (i < temp.length()) {
            
            // Checks if the current character is a period, question mark, or exclamation point.
            if (temp.charAt (i) == '.' || temp.charAt(i) == '?' || temp.charAt(i) == '!') {
                
                // Increments the index.
                i++;

                // Skips any whitespace characters.
                while (i < temp.length() && temp.charAt(i) == ' ') {
                    
                    i++;
                }
                
                // Checks if the index is less than the length of the string.
                if (i < temp.length()) {
                    
                    // Capitalizes the first letter of the next word.
                    temp.setCharAt(i, Character.toUpperCase(temp.charAt(i)));
                }
            }

            // Increments the index.
            i++;
    }
    
    // Returns the capitalized string.
    return temp.toString();
    }
}
