package com.Java8.practice;

import java.util.Scanner;
import java.util.stream.Stream;

public class EvenOddChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			// Create a Stream with a single element (the input number)
			Stream<Integer> numberStream = Stream.of(number);

			// Use the map() function to check if the number is even or odd
			String result = numberStream.map(n -> n % 2 == 0 ? "even" : "odd").findFirst().orElse("Invalid input"); // Handle
																													// the
																													// case
																													// of
																													// an
																													// empty
																													// Stream

			System.out.println(number + " is " + result);
		}
	}
}
