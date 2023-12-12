package com.cg.practice;

public class Casting {

	public static void main(String[] args) {
		long num1 = 25678;
		int num2=(int)num1;     //Explicit casting lasya
		//System.out.println("the value of a is ::" + num1);
	//	System.out.println("the value of a is ::" + num2);
		int bigValue=360;
		byte small=(byte)bigValue;
		System.out.println(small);

		
		for(int i=0;i<=5;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}


	}

}
