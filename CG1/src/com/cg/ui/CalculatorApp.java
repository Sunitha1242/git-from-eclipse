package com.cg.ui;

import com.cg.business.Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		Calculator calculator = null;// create object reference
		calculator = new Calculator();
		calculator.setNumber1(10);
		calculator.setNumber2(20);
		calculator.printResult();
	}

}
