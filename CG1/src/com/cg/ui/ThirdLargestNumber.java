package com.cg.ui;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {

		int[] numbers = {9, 4, 7, 10, 5, 8, 2, 8, 3};
		int thirdLargest = findThirdLargest(numbers);
		System.out.println("The third largest number is: " + thirdLargest);
	}

	public static int findThirdLargest(int[] numbers) {
		if (numbers.length < 3) {
			throw new IllegalArgumentException("Array should have at least 3 elements");
		}

		return Arrays.stream(numbers).distinct() // Remove duplicates
				.sorted()
                .boxed() // Convert to Integer stream
                .skip(numbers.length - 3) // Skip the first (N - 3) elements
				.findFirst().orElseThrow(() -> new RuntimeException("Unable to find the third largest number"));
	}

}
