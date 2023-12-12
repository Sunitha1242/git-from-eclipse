package com.cg.practice;

import java.util.Scanner;

public class ATM {
	private static Scanner scanner = new Scanner(System.in);
	private static int balance = 10000;

	public static void main(String[] args) {
		while (true) {
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				deposit();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}

	private static void checkBalance() {
		System.out.println("Current Balance: " + balance);
	}

	private static void withdraw() {
		System.out.println("Enter Amount to Withdraw:");
		int amount = scanner.nextInt();

		if (amount > balance) {
			System.out.println("Insufficient Balance!");
			return;
		}

		balance -= amount;
		System.out.println("Withdrawn Successfully! Current Balance: " + balance);
	}

	private static void deposit() {
		System.out.println("Enter Amount to Deposit:");
		int amount = scanner.nextInt();

		balance += amount;
		System.out.println("Deposited Successfully! Current Balance: " + balance);
	}
}
