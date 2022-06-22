package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "121421412512";

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				counter++;
			}
		}
		System.out.println("Num 1 appeared " + counter + " times");
	}

}
