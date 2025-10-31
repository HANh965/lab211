/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab0010;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int numberOfArray = linearSearch.getNumber("Enter number of array: ");
        int[] array = new int[numberOfArray];
        linearSearch.generateRandomNumber(array);
        linearSearch.displayArray(array);
        int searchNumber = linearSearch.getNumber("Enter search number: ");
        linearSearch.displayIndexNumber(searchNumber, array);
    }
}