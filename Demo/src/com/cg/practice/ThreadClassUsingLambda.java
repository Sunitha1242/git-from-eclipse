package com.cg.practice;


public class ThreadClassUsingLambda implements Runnable{

	public static void main(String[] args) {
		Runnable obj=()->{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
		};
		Thread obj2=new Thread(obj);
		obj2.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Thread");
		}
		
		}

	@Override
	public void run() {
		
	}
	
	}


