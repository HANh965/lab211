/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0070;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Utility {
    public final String REGEX_USERNAME = "\\d{10}";
    public final String REGEX_PASSWORD = "(?=.*\\d.*)(?=.*[a-zA-Z].*).{8,31}";
    public final String REGEX_CAPTCHA = "[a-zA-Z0-9]+";
    
    Scanner scanner = new Scanner(System.in);
    
    public int getInt(String mess, String firstError, String secondError, String thirdError, int min, int max){
        while (true) {            
            try {
                System.out.print(mess);
                String input = scanner.nextLine().trim();
                if(input.isEmpty()){
                    System.out.println("Input cannot be empty");
                } else {
                    int number = Integer.parseInt(input);
                    if(number<min){
                        System.out.println(firstError);
                    } else if (number>max){
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(thirdError);
            }
        }
    }
    
    public double getDouble(String message, String firstError, String secondError,
            String thirdError, double min, double max) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    double number = Double.parseDouble(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(thirdError);
            }
        }
    }
    
    public float getFloat(String message, String firstError, String secondError,
            String thirdError, float min, float max) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    float number = Float.parseFloat(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(thirdError);
            }
        }
    }
    
    public String getString(String mess, String error, String regex){
        while (true) {            
            System.out.print(mess);
            String input = scanner.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Input cannot be empty!");
            } else {
                if(input.matches(regex)){
                    return input;
                } else {
                    System.out.println(error);
                }
            }
        }
    }
    
}
