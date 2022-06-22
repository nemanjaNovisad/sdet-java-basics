package com.syntax.class08HomeWork;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Choose first number: ");
		int num1 = input.nextInt();
		System.out.println("Choose second number: ");
		int num2 = input.nextInt();

		int sum = 0;
		int sum1 = 0;

		for (int i = num1; i < num2; i++) {
			if (i % 2 == 0) {

				sum = sum + i;
			} else {
				sum1 = sum1 + i;

			}
		}

		System.out.println("Sum of all even numbers between " + num1 + " and " + num2 + " is " + sum + ".");
		System.out.println("Sum of all odd numbers between " + num1 + " and " + num2 + " is " + sum1 + ".");

	}

}
