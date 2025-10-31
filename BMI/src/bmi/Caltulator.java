package bmi;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Caltulator {
    private static final Scanner in = new Scanner(System.in);
    
    public static int menu(){
        System.out.println("1. Normal Calculator ");
        System.out.println("2. BMI Calculator ");
        System.out.println("3. Exit ");
        System.out.println("Enter your choice: ");
        int choice = checkInputInt(1, 3);
        return choice;
    }
    
    public static int checkInputInt(int min, int max){
        while (true) {            
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if(result<min || result>max){
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage[" + min + ", " + max + "]");
                System.out.println("Again: ");
            }
        }
    }
    
    public static double checkInputDouble(){
        while (true) {            
            try {
                double result = Double.parseDouble(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input double");
                System.out.println("Again: ");
            }
        }
    }
    
    public static String checkInputOperator(){
        while (true) {            
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-") ||
                    result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/") ||
                    result.equalsIgnoreCase("^") || result.equalsIgnoreCase("="))
                return result;
            else {
                System.err.println("Please input +,-,*,/,^");
            }
            System.out.print("Enter again: ");
        }
    }
    
    public static double inputNumber(){
        System.out.println("Enter number: ");
        double number = checkInputDouble();
        return number;
    }
    
    public static void normalCalculator(){
        double memory;
        System.out.print("Enter number: ");
        memory = checkInputDouble();
        while (true) {            
            System.out.print("Enter operator: ");
            String operator = checkInputOperator();
            if(operator.equalsIgnoreCase("+")){
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            }
            if(operator.equalsIgnoreCase("-")){
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if(operator.equalsIgnoreCase("*")){
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if(operator.equalsIgnoreCase("/")){
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if(operator.equalsIgnoreCase("^")){
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            }
            if(operator.equalsIgnoreCase("=")){
                System.out.println("Result: " + memory);
                return;
            }
        }
    }
    
    public static String BMIStatus(double bmi){
        if(bmi<=19){
            return "Under-standard";
        } else if (bmi>19 && bmi<=25){
            return "Standard";
        } else if (bmi>25 && bmi<=30){
            return "Overweight";
        } else if (bmi>30 && bmi<=40){
            return  "Fat - should lose weight";
        } else 
            return "Very fat - should lose weight immediately";
    }
    
    public static void BMICalculator(){
        System.out.println("Kg: ");
        double weight = checkInputDouble();
        System.out.println("Met: ");
        double height = checkInputDouble();
        double bmi = weight / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }
    
}
