package tasks;

public class Task009 {

    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int[] array = {-3, -6, -1, 5, 7, 89};
        int maxNum = array[0];
        int minNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            } else if (array[i] < minNum) {
                minNum = array[i];
            }
        }

        System.out.println("Maximum value is " + maxNum);
        System.out.println("Minimum value is " + minNum);
    }

}
