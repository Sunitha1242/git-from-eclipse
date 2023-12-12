package com.cg.ui;

interface Infer {
	void add(int a,int b);
}

public class Test2 {

	public static void main(String[] args) {
		Infer i = (a,b) -> System.out.println(a+b);
	
	i.add(10,20);
	
	}

}
