package Amity_DSA;

import java.util.Scanner;

class WordCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Call the method to count words
        int wordCount = countWords(inputString);

        // Display the word count
        System.out.println("Number of words in the string: " + wordCount);
    }

    // Method to count words in a string
    public static int countWords(String str) {
        // Trim leading and trailing spaces
        str = str.trim();
        // If the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }
        // Split the string into words based on whitespace
        String[] words = str.split("\\s+");
        // Return the length of the array, which represents the number of words
        return words.length;
    }
}