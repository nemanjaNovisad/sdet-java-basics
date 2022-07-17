package tasks;

public class Task003 {

    public static void main(String[] args) {


//		3.Create a 2D array of integer values. Print the sum of
//		all numbers.


//1. Declaration of 2D Array

        int[][] array = {{2, 3, 4, 5}, {4, 5, 6, 7, 67, 88}, {33, 56, 77, 8, 88}};
//2. Initializing variable sum
        int sum = 0;
//3. Nested For Loop to read all the elements of the arrays
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
//4. We use same formula for 'sum' in one dimensional array only without index [j]
                sum += array[i][j];

            }

        }
        System.out.println(sum);
    }

}
