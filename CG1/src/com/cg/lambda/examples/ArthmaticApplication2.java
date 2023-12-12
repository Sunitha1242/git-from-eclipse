package com.cg.lambda.examples;

import java.util.Scanner;

public class ArthmaticApplication2 {
	@FunctionalInterface
	interface ArthmaticOperation{
		double calculate(double a,double b);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first digit");
		double num1=scanner.nextDouble();
		System.out.println("Enter second digit");
		double num2=scanner.nextDouble();
		ArthmaticOperation addition=(x,y)->x+y;
		System.out.println(addition.calculate(num1, num2));
		ArthmaticOperation substraction=(a,b)->a-b;
		System.out.println(substraction.calculate(num1, num2));
		ArthmaticOperation multiplication=(a,b)->a*b;
		System.out.println(multiplication.calculate(num1, num2));
		ArthmaticOperation division=(a,b)->a/b;
		System.out.println(division.calculate(num1, num2));
		
		

	}

}
