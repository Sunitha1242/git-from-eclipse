package com.exceptionhandling.examples;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int i=18,j=4;
		final int result=i/(j-2);
		System.out.println(result);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
			
		}
		

	}

}
