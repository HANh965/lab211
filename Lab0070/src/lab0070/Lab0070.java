/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab0070;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Lab0070 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utility utility = new Utility();
        Ebank ebank = new Ebank();
        List<Account> listAccount = new ArrayList<>();
        ebank.mockData(listAccount);
        while (true) {
            displayMenu();
            int option = utility.getInt("Please choice one option:", "Wrong", "Wrong", "Wrong", 1, 3);

            switch (option) {
                case 1:
                    ebank.loginVietNamese(listAccount);
                    break;
                case 2:
                    ebank.loginEnglish(listAccount);
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }

    private static void displayMenu() {
        System.out.println("-------Login Program-------\n"
                + "1. Vietnamese\n"
                + "2. English\n"
                + "3. Exit");
    }
}
