package lab0010;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class LinearSearch {

    int getNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please input positive decimal number!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input positive decimal number!!");
            }
        }
    }

    void generateRandomNumber(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    void displayIndexNumber(int searchNumber, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.format("Found %s at index: %s\n", searchNumber, i);
                return;
            }
        }
        System.out.println("Not found !!");
    }

    void displayArray(int[] array) {
        System.out.println("The array: " + Arrays.toString(array));
    }

}