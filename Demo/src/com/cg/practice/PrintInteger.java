package com.cg.practice;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter an Integer::");
			int num = scanner.nextInt();
			System.out.println("The entered Integer by the User is::" + num);
		}
	}
}
