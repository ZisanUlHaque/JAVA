/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Special_Word;


import java.util.Scanner;

public class SpecialWordFinder {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner s = new Scanner(System.in);

        // Ask for a sentence
        System.out.print("Enter a sentence: ");
        String input = s.nextLine();  // Read the entire line of text

        // Split the input into words by spaces
        String[] words = input.split(" ");

        // Print each word that contains an uppercase letter
        System.out.println("Special words are:");
        for (String w : words) {
            // Check if the word has an uppercase letter
            boolean hasUppercase = false;
            for (int i = 0; i < w.length(); i++) {
                if (Character.isUpperCase(w.charAt(i))) {
                    hasUppercase = true;
                    break;
                }
            }
            if (hasUppercase) {
                System.out.println(w);
            }
        }

        // Close the scanner
        s.close();
    }
}

