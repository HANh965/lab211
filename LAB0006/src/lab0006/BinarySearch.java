package lab0006;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

    public int getInt(String message, String firstError, String secondError,
            String thirdError, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    int number = Integer.parseInt(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }

    void randomElement(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    void search(int searchNumber, int[] array) {
        int start = 0;
        int end = array.length - 1;

        int count = 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (array[middle] == searchNumber) {
                System.out.format("Step %s (middle element is %s = %s): ", count, array[middle], searchNumber);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
//               System.out.println("Found " + searchNumber + " at index: " + middle);
                return;
            } else if (array[middle] > searchNumber) {
                System.out.format("Step %s (middle element is %s > %s): ", count, array[middle], searchNumber);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
                end = middle - 1;
            } else {
                System.out.format("Step %s (middle element is %s < %s): ", count, array[middle], searchNumber);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
                start = middle + 1;
            }
            count++;
        }

        System.out.printf("Step %s (searched value is absent): ", count);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
