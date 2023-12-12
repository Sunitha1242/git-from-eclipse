package com.Java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface infer {
	void toFindOddEven();
}

public class FindingOddOrEven {

	public static void main(String[] args) throws Exception{
//		Integer[] integers = { 1, 2, 3, 4, 5 };
//		List<Integer> l = Arrays.asList(integers);
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a digit::");
			int number = s.nextInt();
			List<Integer> l = Arrays.asList(number);

			//System.out.println("Odd or Even Numbers::");
			infer i = () -> {
				// for (int number : l) {
				if (number % 2 == 0)
					System.out.println("even");
				else
					System.out.println("odd");
				// }
			};
			i.toFindOddEven();
		}

	}
}
