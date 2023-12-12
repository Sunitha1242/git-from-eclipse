package com.exceptionhandling.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
//		BufferedReader br=null;
//		try
//		{
//			br=new BufferedReader(new FileReader("C:\\Users\\sumuddan\\Documents\\Unique NA\\ticket.txt"));
//			String line;
//			while((line= br.readLine())!=null)
//					{
//				System.out.println(line);
//					}
//			
//		}
//		catch(FileNotFoundException e) {
//			System.err.format("File Not found:: %s", e);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.err.format("IO Exception::%s", e);
//		}

		
		Dog d=null;
		try
		{
			System.out.println(d.dogName());
		}
		
			catch(NullPointerException ex)
		{
			d=new Dog();
			System.out.println(d.dogName());
		}
		
		 catch(Exception ex)
		{
			
		}
		
		
		

	}
	
}
 class Dog
{
	String name;
	 String dogName() {
		
		name="Tommy";
		//System.out.println("the dog name is :: " , name);
		//System.out.println("the dog name is ::" ,name);
		return name;
		
	}
}