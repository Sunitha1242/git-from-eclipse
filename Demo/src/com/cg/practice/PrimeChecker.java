package com.cg.practice;

import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a positive integer: ");
			int number = scanner.nextInt();

			boolean isPrime = isPrime(number);

			if (isPrime) {
				System.out.println(number + " is a prime number.");
			} else {
				System.out.println(number + " is not a prime number.");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false; // 0 and 1 are not prime
		}
		if (n <= 3) {
			return true; // 2 and 3 are prime
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false; // Divisible by 2 or 3
		}

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}

		return true;

	}
}
