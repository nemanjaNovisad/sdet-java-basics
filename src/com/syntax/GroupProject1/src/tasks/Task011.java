package tasks;

public class Task011 {

    public static void main(String[] args) {

//		Write a program to print out duplicate elements from
//		an Array of Strings?

        String[] array = {"A", "B", "C", "D", "D"};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    System.out.println(array[i]);
                }

            }
        }

    }

}
