/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {            
            int choice = Caltulator.menu();
            switch (choice) {
                case 1:
                    Caltulator.normalCalculator();
                    break;
                case 2:
                    Caltulator.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
    
}
