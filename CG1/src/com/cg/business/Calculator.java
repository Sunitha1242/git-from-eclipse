package com.cg.business;

public class Calculator {
	private int number1;
	private int number2;// data member  , instance variables
	private int result;

	public void printResult() {
		System.out.println(result);
	}

	public void add(){	
	 result = number1+number2;
					
	}
	public void substract() {
		result=number1-number2;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	}


