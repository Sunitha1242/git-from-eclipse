package com.cg.practice;

import java.util.Arrays;
import java.util.List;

public class FindEvenOddJava8 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Even Numbers::");
		numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
		System.out.println("Odd Numbers::");
		numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
	}

}
