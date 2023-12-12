package com.Java8.practice;

import java.util.function.Predicate;

public class Palindrome {
	public static void main(String[] args) {
		String input = "racecar";
		boolean isPalindrome = isPalindrome(input);
		System.out.println("Is '" + input + "' a palindrome? " + isPalindrome);

	}

	public static boolean isPalindrome(String str) {
		// Remove spaces and convert to lowercase for case-insensitive comparison
		String cleaned = str.replaceAll("\\s", "").toLowerCase();

		// Use Java 8 Stream and Predicate to check if it's a palindrome
		Predicate<String> isPalindrome = s -> s.equals(new StringBuilder(s).reverse().toString());

		return isPalindrome.test(cleaned);
	}
}
