package com.cg.practice;

import java.util.Scanner;

public class MillionireApp {

	public static void main(String[] args) {
		

System.out.println("Who is the inventor of light bulb A. B. C. D.");
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		switch(ans)
		{
		case "A":System.out.println("Your are right");
		break;
		case "B":
		case "C":
		case "D":System.out.println("you are wrong");
		}
			
	}
}
//
//		if (ans.equals("A")) {
//			System.out.println("Your are right");
//		} else if (ans.equals("B") || ans.equalsIgnoreCase("C") || ans.equals("D")) {
//			System.out.println("you are wrong");
//		}else 
//		{
//			System.out.println("Invalid input enter either of the options A,B,C,D");
//		}
//
//	}
//
//}
