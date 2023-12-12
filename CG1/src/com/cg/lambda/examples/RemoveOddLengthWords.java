package com.cg.lambda.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Remove the words that have odd lengths from the list.
 *  HINT: use one of the new methods from JDK8.
 *  Use  removeIf() method from collection interface.*/
 

public class RemoveOddLengthWords {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "date", "elephant"));
		System.out.println("Enterd List::" + words);
		// Remove words with odd lengths
		words.removeIf(word -> word.length() % 2 != 0);

		// Print the updated list
		System.out.println(words);
	}
}