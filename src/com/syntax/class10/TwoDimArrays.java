package com.syntax.class10;

public class TwoDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = new int[3][4];

		// 1st row
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		// 2st row
		numbers[1][0] = 1;
		numbers[1][1] = 2;
		numbers[1][2] = 3;
		numbers[1][3] = 4;

		// 3st row
		numbers[2][0] = 9;
		numbers[2][1] = 8;
		numbers[2][2] = 7;
		numbers[2][3] = 6;

		int rows = numbers.length;
		System.out.println("Number of rows = " + rows);

		int colsOf1row = numbers[0].length;
		System.out.println("Number of cols in 1 row = " + colsOf1row);

		String[][] usa = { { "Manhattan", "Buffalo", "Albany" }, { "Miami", "WPB", "Fort" },
				{ "LA", "SF", "San Diego" }, { "Boston", "Edgartown", "Cambridge" }

		};

		System.out.println(usa[1][0]);
	}
}
