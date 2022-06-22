package com.syntax.class10;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums = {

				{ 1, 2, 3, 4, 5 }, { 3, 33, 4, 55 }, { 545, 4, 4, 43 }

		};

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {

				System.out.print(nums[i][j] + " ");

			}
			System.out.println();

		}

	}

}
