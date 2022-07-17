package tasks;

public class Task004 {

    public static void main(String[] args) {

//		Create a 2D array or integer type where you will store
//		odd and even numbers. Develop a program which will
//		identify/print the even numbers only.

        int[][] array = {{2, 3, 4, 5}, {4, 5, 6, 7, 67, 88}};

        int evenNum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] % 2 == 0) {

                    evenNum = array[i][j];
                    System.out.println(evenNum);

                }

            }

        }

    }

}
