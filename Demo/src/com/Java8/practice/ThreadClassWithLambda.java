package com.Java8.practice;

public class ThreadClassWithLambda implements Runnable {

	public static void main(String[] args) {
		Runnable obj1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread obj=new Thread(obj1);
		obj.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	} 

	@Override
	public void run() {
		
	}
	}


