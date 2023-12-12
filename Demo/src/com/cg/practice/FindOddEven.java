package com.cg.practice;

import java.util.Scanner;

public class FindOddEven {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter a number::");
			String input = scanner.next();
			if (input.length() == 1 && Character.isDigit(input.charAt(0))) {

				int num = Integer.parseInt(input);
				if (num % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("odd");

				}

			} else {
				System.out.println("Invalid input!!!");
			}
		}
	}
}
