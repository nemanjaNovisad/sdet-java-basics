package com.syntax.class09;

public class DoubleArray {

	public static void main(String[] args) {

		int[] array = { 5, -7, 98, 999, 3 };
		int maxNum = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > maxNum) {
				maxNum = array[i];
			}

		}
		System.out.println(maxNum);

		System.out.println("---------------------------");

		char[] charArr = { 'a', 'v', 'k', '7', '*' };

		for (int j = charArr.length - 1; j >= 0; j--) {
			System.out.println(charArr[j]);
		}

	}

}
