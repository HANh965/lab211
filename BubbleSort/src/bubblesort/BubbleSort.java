package bubblesort;
import java.util.*;
public class BubbleSort {

    public int getInt(String message, String firstError, String secondError, String thirdError, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println(message);
                String input = scanner.nextLine().trim();
                if(input.isEmpty()){
                    System.out.println("Input cannot be empty");
                } else {
                    int number = Integer.parseInt(input);
                    if(number<min){
                        System.out.println(firstError);
                    } else if (number>max){
                        System.out.println(secondError);
                    } else{
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
        for(int i=0; i<array.length; i++)
            array[i] = random.nextInt(array.length);
    }
    
    void sort(int[] array) {
        int length = array.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
