package com.cg.lambda.examples;

import java.util.Scanner;

public class ArithmaticApplication {

	@FunctionalInterface
	interface ArithmeticOperation {
		double calculate(double a, double b);
	}

	public static void main(String[] args) {
		double num1 = 10.5;
		double num2 = 5.5;
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter the first number (num1): ");
//		double num1 = scanner.nextDouble();
//
//		System.out.print("Enter the second number (num2): ");
//		double num2 = scanner.nextDouble();

		ArithmeticOperation addition = (a, b) -> a + b;
		ArithmeticOperation subtraction = (a, b) -> a - b;
		ArithmeticOperation multiplication = (a, b) -> a * b;
		ArithmeticOperation division = (a, b) -> a / b;

		System.out.println("Addition: " + addition.calculate(num1, num2));
		System.out.println("Subtraction: " + subtraction.calculate(num1, num2));
		System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
		System.out.println("Division: " + division.calculate(num1, num2));
	}
}
