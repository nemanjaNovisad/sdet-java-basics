package tasks;

import java.util.Scanner;

public class Task002 {

    public static void main(String[] args) {

//		Using Scanner create an array of countries. When an
//		array is created, retrieve all values from it and while
//		retrieving those values print capital for each country.
//		(use 2 different loops).

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country you want to save to the array");
        String country1 = input.nextLine();
        String country2 = input.nextLine();
        String country3 = input.nextLine();
        String country4 = input.nextLine();
        System.out.println("Enter the capitals of the corresponding countries");
        String capital1 = input.nextLine();
        String capital2 = input.nextLine();
        String capital3 = input.nextLine();
        String capital4 = input.nextLine();
        String[] countries = {country1, country2, country3, country4};
        String[] capitals = {capital1, capital2, capital3, capital4};
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < capitals.length; j++) {
                if (i == j) {
                    System.out.println("The capital of " + countries[i] + " is " + capitals[j] + ".");
                }
            }
        }

        int length1 = countries.length;
        int length2 = capitals.length;
        int i = 0;
        int j = 0;
        while (i < length1) {
            while (j < length2) {
                if (i == j) {
                    System.out.println("The capital of " + countries[i] + " is " + capitals[j]);
                    i++;
                    j++;
                }
            }
        }
    }

}
