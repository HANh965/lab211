/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab0071;

/**
 *
 * @author ADMIN
 */
public class Lab0071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManageTask manage = new ManageTask();
        Utility utility = new Utility();
        
        while (true) {
            displayMenu();
            int option = utility.getInt("Option: ", "Wrong", "Wrong", "Wrong", 1, 4);

            switch (option) {
                case 1:
                    //input task
                    manage.inputTask();
                    break;
                case 2:
                    //delete task
                    manage.deleteTask();
                    break;
                case 3:
                    //display task
                    manage.displayTask();
                    break;
                case 4:
                    System.exit(0);
                    break;

            }

        }
    }
    
    private static void displayMenu() {
        System.out.println("========= Task program =========\n"
                + "1.	Add Task\n"
                + "2.	Delete task\n"
                + "3.	Display Task\n"
                + "4.	exit");
    }
}
