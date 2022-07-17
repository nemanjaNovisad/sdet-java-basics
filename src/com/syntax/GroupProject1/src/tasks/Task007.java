package tasks;

import java.util.Scanner;

public class Task007 {

    public static void main(String[] args) {

//		7.Write a java program to check whether a given
//		number is prime or not?

//		A prime number is any integer, or whole number, greater than 1 that is only divisible by 1 and itself.

//		Nemanja

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a number to check if it's a prime number or not: ");
        int number = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true && number > 0 && number != 1) {
            System.out.println("Number " + number + " is prime number.");
        } else {
            System.out.println("Number " + number + " is not a prime number.");
        }
    }
}
