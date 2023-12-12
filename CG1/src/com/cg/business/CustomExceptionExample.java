package com.cg.business;

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			int result = divide(1, 0);
			System.out.println("Result: " + result);
		} catch (CustomException e) {
			System.err.println("Custom Exception: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception: Division by zero");
		}
	}

	public static int divide(int dividend, int divisor) throws CustomException  {
		if (divisor == 0) {
			throw new CustomException("Division by zero is not allowed.");
		}
		return dividend / divisor;
	}
}
