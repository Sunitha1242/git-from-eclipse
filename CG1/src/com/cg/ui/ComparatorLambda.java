package com.cg.ui;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {

		Comparator<String> compare=new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(),o2.length());
			}
			
			
		};
		
	}

}
