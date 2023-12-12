package com.Java8.practice;

interface Infer
{
	public void toSum(int a,int b);
}
interface Infer2
{
	public int toSquare(int x);
}
interface Infer3
{
	public void toFindLength(String y);
}


public class Sum {

	public static void main(String[] args) {
		Infer i=(a,b)->System.out.println("The sum is :" +(a+b));
		i.toSum(10,20);
		i.toSum(100,200);
		Infer2 i2=x->x*x;
		System.out.println("The square of the digit is :" +i2.toSquare(5));
		Infer3 i3=y->System.out.println("The length of the string is :" +y.length());
		i3.toFindLength("Sunita Ramani");
				}

}
