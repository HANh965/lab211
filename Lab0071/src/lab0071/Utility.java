/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Utility {
    public final String REGEX_DATE = "[0-9]{1,2}[/-][0-9]{1,2}[/-][0-9]{4}";
    
    Scanner scanner = new Scanner(System.in);
    public final String REGEX_STRING = "[a-zA-Z0-9 ]+";
    
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
                    } else if (number % 0.5 != 0){
                    System.out.println("need % 0.5");
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
    
    public String getDate(){
        while (true) {            
            System.out.print("Enter date: ");
            String input = scanner.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Input cannot be empty!!");
            } else {
                if (!input.matches(REGEX_DATE)) {
                    System.out.println("Date must be in format dd/MM/yyyy "
                            + "or dd-MM-yyyy");
                } 
                    SimpleDateFormat msg1 = new SimpleDateFormat("dd/MM/yyyy");
                    msg1.setLenient(false);
                    SimpleDateFormat msg2 = new SimpleDateFormat("dd-MM-yyyy");
                    msg2.setLenient(false);
                    
                    try {
                        msg1.parse(input);
                        return input;
                    } catch (ParseException e1) {
                        try {
                            msg2.parse(input);
                            return input;
                        } catch (ParseException e2) {
                            System.out.println("Date does not exist!!");
                        }
                        
                    
                }
            }
        }
    }
}
