package com.cg.practice;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your Input::");
			String input = scanner.next();

			if (isPalindrome(input)) {
				System.out.println("The entered input is Palindrome!!!");
			} else {
				System.out.println("The entered input is not Palindrome!!");

			}

		}
	}

	private static boolean isPalindrome(String input) {

		int length = input.length();
		StringBuilder rev = new StringBuilder(length);
		// System.out.println(rev);
		for (int i = length - 1; i >= 0; i--) {
			rev.append(input.charAt(i));
		}
		String reverse = rev.toString();
		System.out.println(reverse);
		if (reverse.equals(input))
			return true;
		else
			return false;
	}

}
