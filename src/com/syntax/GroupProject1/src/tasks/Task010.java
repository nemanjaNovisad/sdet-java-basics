package tasks;

public class Task010 {

    public static void main(String[] args) {

//		Write a java program to find the second largest
//		number in the array?

//		int [] array = {10,44,54,754,86};
//		System.out.println(Arrays.toString(array));
//		
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		
//		System.out.println(array[0]);
//		System.out.println(array[array.length-1]); //largest - last index is always size -1
//		System.out.println(array[array.length-2]); //second largest

        int[] array = {10, 9, 20, 30, 29186, 45};

        int maxNum = array[0];
        int secondLargest = array[0];

        for (int num : array) {
            if (num > maxNum) {
                maxNum = num;

            }
            if (num > secondLargest && secondLargest < maxNum && num < maxNum) {
                secondLargest = num;
            }
        }
        System.out.println("Maximum number of the array is " + maxNum);
        System.out.println("Second largest number of the array is " + secondLargest);

    }

}
