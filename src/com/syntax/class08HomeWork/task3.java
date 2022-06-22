package com.syntax.class08HomeWork;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to buy? ");
		String item = input.nextLine();

		System.out.println("What is the price? ");
		double price = input.nextDouble();

		double payment = 0;

		double balance = price - payment;

		do {

			System.out.println("How much would you like to pay");
			payment = input.nextInt();
			balance = balance - payment;
		} while (balance > 0);

		if (balance == 0) {
			System.out.println("You paid off your balance");
		} else if (balance < 0) {
			System.out.println("Your change is " + balance * -1);
		}

	}

}
