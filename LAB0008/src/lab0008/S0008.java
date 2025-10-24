/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0008;

import java.util.Scanner;
import java.util.StringTokenizer;

public class S0008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your content: \n");
        String input = sc.nextLine();

        // Đếm số từ bằng StringTokenizer
        StringTokenizer st = new StringTokenizer(input);
        int wordCount = st.countTokens();

        // Đếm số ký tự (không tính khoảng trắng ở đầu/cuối)
        int charCount = input.replace(" ", "").length();
        
        int letterCount = 0;
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                letterCount++;
            }
        }
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of characters: " + charCount);
    }
}
