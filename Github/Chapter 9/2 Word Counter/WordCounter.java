/*
 * Programming Challange 9.2: Word Counter
 * Date of Last Modification: 03/20/2025
 * 
 * Purpose: This program prompts the user for
 *          a sentence or phrase and then counts
 *          the number of words in the input.
 * 
 * Assumptions: 
 * - The user will enter a valid line of text.
 * - Words are delimited by one or more whitespace characters.
 * - The program outputs the number of words.
 * - The program will answer "0" if the user enters an empty string.
 * - There are no known bugs or issues.
 */

 import java.util.Scanner;

 public class WordCounter {

    /**
     * Main method to prompt the user for a sentence or phrase,
     * calls the countWords method, and displays the number of words.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        
        // Declares a variable to store the user input.
        String input;

        // Creates a Scanner object to read user input.
        try (Scanner keyboard = new Scanner(System.in)) {
            
            // Prompts the user for a sentence or phrase.
            System.out.print("Please enter a sentence or phrase: ");
            
            // Reads the user input.
            input = keyboard.nextLine();
        }
            // Calls the countWords method to count the number of words.
            int wordNumber = countWords(input);
            
            // Displays the number of words.
            System.out.println("Number of words: " + wordNumber);
    }

    /**
     * Counts the number of words in a given string.
     * @param str The string to be counted.
     * @return The number of words in the string.
     */
    public static int countWords(String str) {

        // Trims the string to remove leading/trailing whitespace.
        str = str.trim();

        // If the string is empty, return 0.
        if (str.equals("")) {
            return 0;
            }
        
        // Declares a variable to store the word count.
        int count = 0;
        boolean inWord = false;
        
        // Loops through the string to count the number of words.
        for (int i = 0; i < str.length(); i++) {

            // Gets the character at the current index.
            char ch = str.charAt(i);

            // If the character is not a space, we're in a word.
            if (ch != ' ') {

                // If we're transitioning from a space to a word, increment the count.
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {

                // A space indicates the end of a word.
                inWord = false;
            }
        }

        // Returns the total word count.
        return count;
    }

 }