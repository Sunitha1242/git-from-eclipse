package com.cg.practice;

import java.util.Scanner;

class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) { // Continuously prompt for input
            System.out.println("Enter a character (or press 'Q' to quit):");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Q")) {
                break; // Exit the loop if 'Q' or 'q' is entered
            }

            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                char ch = input.charAt(0);
                System.out.println(ch);

                if (isVowel(ch)) {
                    System.out.println("Entered character is a vowel");
                } else {
                    System.out.println("Entered character is a consonant");
                }
            } else {
                System.out.println("Please enter a valid character.");
            }
        }
    }

    // A method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
