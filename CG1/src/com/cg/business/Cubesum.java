package com.cg.business;

import java.util.*;
import java.io.*;

class Cubesum {
	public static void main(String args[]) {
		int input = 0;
		int num1, num2, num3;

		// read the number
		System.out.println("Enter a Number");
		Scanner console = new Scanner(System.in);
		input = Integer.parseInt(console.nextLine());

		// now let us print the cube of digits
		// i.e if number is 123 we will print 1^3, 2^3 and 3^3
		// we will also add 1 and 3 to output the sum of first
		// and last digits
		int number = input; // number is a temp variable
		int counter = 0; // counter is used to count no of digits

		while (number > 0) {
			int t = number % 10;
			System.out.println("Cube of " + t + " is " + (t * t * t));
			counter = counter + 1;
			number = number / 10;

		}

	}

}
