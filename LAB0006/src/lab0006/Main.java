
package lab0006;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        //enter number of array
//        int number = binarySearch.getInt("Enter number of array: ", "Must be greater than 1",
//                "Must be greater than 1", "Number must be digits", 1, Integer.MAX_VALUE);

        //create an array 
//        int[] array = new int[number];
        
         int[] array = {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        //Generate random integer in number range for each array element.
//        binarySearch.randomElement(array);

        binarySearch.sort(array);
        //enter search value
        int searchNumber = binarySearch.getInt("Enter search value: ", "Must be digits",
                "Must be digits", "Number must be digits", Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        //sorted
        
        //search by binary search
        binarySearch.search(searchNumber, array);
        
    }
    
}
