package com.syntax.class08HomeWork;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours = 24;
		int minutes = 60;

		for (int i = 0; i < hours; i++) {

			for (int j = 0; j < minutes; j++) {

				if (i < 10 && j < 10) {
					System.out.println("0" + i + ":0" + j);
				} else if (i < 10 && j > 9) {
					System.out.println("0" + i + ":" + j);
				} else if (i > 9 && j < 10) {
					System.out.println(i + ":0" + j);
				} else if (i > 9 && j > 9) {
					System.out.println(i + ":" + j);

				}

			}

		}

	}

}
