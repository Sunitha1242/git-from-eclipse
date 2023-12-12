package com.cg.practice;

import java.util.Scanner;

public class ArmstrongClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a digit::");
			int number = scanner.nextInt();

			if (isArmstrong(number)) {
				System.out.println("The entered number is Armstrong Number");
			} else {
				System.out.println("The entered number is not Armstrong Number");

			}
		}
	}

	private static boolean isArmstrong(int number) {
		int n = 0, remainder = 0, result = 0;
		int originalNumber = number;
		while (originalNumber != 0) {
			originalNumber /= 10;
			++n;
		}
		originalNumber = number;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
			originalNumber /= 10;
		}
		if (result == number) {
			return true;
		} else {
			return false;

		}
	}

}
