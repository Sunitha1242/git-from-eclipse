package com.cg.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*Create a string that consists of the first letter of 
each word in the list of strings provided. 
HINT: Use consumer interface & String Builder to construct 
the result.*/
public class FirstLetterOfStringList {
	public static void main(String[] args) {
		List<String> wordList = Arrays.asList("apple", "banana", "carrot", "date", "elephant");

		StringBuilder resultBuilder = new StringBuilder();

		Consumer<String> firstLetterConsumer = word -> resultBuilder.append(word.charAt(0));

		wordList.forEach(firstLetterConsumer);

		String result = resultBuilder.toString();

		System.out.println("Result: " + result);
	}

//	 List<String> wordList = Arrays.asList("apple", "banana", "carrot", "date", "elephant");
//
//     Consumer<String> firstLetterConsumer = word -> {
//         char firstLetter = word.charAt(0);
//         System.out.println(firstLetter);
//     };
//
//     wordList.forEach(firstLetterConsumer);
}
