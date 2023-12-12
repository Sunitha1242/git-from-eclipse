package com.cg.lambda.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
/* use the functional interfaces Supplier,Consumer,Predicate 
 * & Function to invoke  built in methods from Java API
 */


public class JavaApiExample {
	public static void main(String[] args) {
		// Supplier example: Get the current system time
		Supplier<Long> currentTimeSupplier = System::currentTimeMillis;
		long currentTime = currentTimeSupplier.get();
		System.out.println("Current time: " + currentTime);
		// Supplier2
		Supplier<Double> randomNumberSupplier = Math::random;
		double randomNumber = randomNumberSupplier.get();
		System.out.println("Random number: " + randomNumber);

		// Consumer example: Print each element in a list
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		Consumer<String> printConsumer = System.out::println;
		fruits.forEach(printConsumer);

		// Consumer2
		Consumer<String> stringPrinter = System.out::println;
		stringPrinter.accept("Hello, world!");

		// Predicate example: Check if a string is empty
		Predicate<String> emptyStringPredicate = String::isEmpty;
		String text = "";
		boolean isEmpty = emptyStringPredicate.test(text);
		System.out.println("Is the string empty? " + isEmpty);

		// Predicate2
		Predicate<Integer> isEven = num -> num % 2 == 0;
		boolean result = isEven.test(10);
		System.out.println("Is even? " + result);
		System.out.println("Is 10 even? " + isEven.test(10));
		System.out.println("Is 7 even? " + isEven.test(7));

		// Function example: Convert a string to uppercase
		Function<String, String> toUpperCaseFunction = String::toUpperCase;
		String originalText = "hello world";
		String upperCaseText = toUpperCaseFunction.apply(originalText);
		System.out.println("Original text: " + originalText);
		System.out.println("Uppercase text: " + upperCaseText);

		// Function2

		Function<String, Integer> stringLength = String::length;
		int length = stringLength.apply("Hello");
		System.out.println("String length: " + length);
	}

}
