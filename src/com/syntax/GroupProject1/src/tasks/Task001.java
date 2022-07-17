package tasks;

import java.util.Scanner;

public class Task001 {

    public static void main(String[] args) {

//		Using Scanner create an array of integer values. After
//		the array is created, calculate the sum of all stored
//		elements in that array.

        Scanner input = new Scanner(System.in);

        System.out.println("Type 4 elements you want to store in the array: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int sum = 0;

//		Values we got from scanner we store in the array below

        int[] array = {num1, num2, num3, num4};

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];

        }
        System.out.println("Sum of all numbers in the array is " + sum + ".");
    }
}