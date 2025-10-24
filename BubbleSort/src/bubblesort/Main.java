package bubblesort;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int number = bubbleSort.getInt("Enter number of array: ", "Must be greater than 1",
                "Must be greater than 1", "Number must be digits", 1, Integer.MAX_VALUE);
        int[] array = new int[number];
        
        bubbleSort.randomElement(array);
        System.out.println("Unsorted array: " + Arrays.toString(array));
        bubbleSort.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));    
    }
}
