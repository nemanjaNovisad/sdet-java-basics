package tasks;

public class Task008 {

    public static void main(String[] args) {

//		Write a Java Program to print the first 10 numbers of
//		Fibonacci series.

        int previousNum = 0;
        int currentNum = 1;
        int nextNumber = 0;
        int numbersToPrint = 10;

        System.out.println(0);
        System.out.println(1);

        for (int i = 0; i < numbersToPrint - 2; i++) {
            nextNumber = previousNum + currentNum;
            System.out.println(nextNumber + " ");
            previousNum = currentNum;
            currentNum = nextNumber;

        }

    }

}
