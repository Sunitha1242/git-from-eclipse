package com.cg.ui;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OccurranceOfEachCharacterInString2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.nextLine();

		// String s = "Java Application";
		Map<Character, Integer> charCount = new TreeMap();
		for (int i = 0; i < s.length(); i++) {

			if (charCount.containsKey(s.charAt(i))) {
				int count = charCount.get(s.charAt(i));
				charCount.put(s.charAt(i), ++count);
			} else {
				charCount.put(s.charAt(i), 1);

			}

		}
		System.out.println(charCount);
	}

}
