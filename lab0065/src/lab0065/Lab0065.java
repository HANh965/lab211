/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab0065;

/**
 *
 * @author ADMIN
 */
import java.util.*;

public class Lab0065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation markCalc = new Calculation();
        List<Student> students = new ArrayList<>();

        System.out.println("====== Management Student Program ======");

        while (true) {
            System.out.print("Name:");
            String name = sc.nextLine().trim();

            System.out.print("Classes:");
            String classes = sc.nextLine().trim();

            double maths = inputMark(sc, "Maths");
            double chemistry = inputMark(sc, "Chemistry");
            double physics = inputMark(sc, "Physics");

            students.add(markCalc.createStudent(name, classes, maths, chemistry, physics));

            System.out.print("Do you want to enter more student information?(Y/N):");
            String choice = sc.nextLine().trim();
            if (choice.equalsIgnoreCase("N")) break;
        }

        markCalc.averageStudent(students);
        displayStudents(students);
        markCalc.getPercentTypeStudent(students);
    }

    private static double inputMark(Scanner sc, String subject) {
        double mark;
        while (true) {
            System.out.print(subject + ":");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(subject + " is digit");
                continue;
            }
            try {
                mark = Double.parseDouble(input);
                if (mark > 10) {
                    System.out.println(subject + " is less than equal ten");
                } else if (mark < 0) {
                    System.out.println(subject + " is greater than equal zero");
                } else {
                    return mark;
                }
            } catch (NumberFormatException e) {
                System.out.println(subject + " is digit");
            }
        }
    }

    private static void displayStudents(List<Student> students) {
        int i = 1;
        for (Student s : students) {
            s.displayInfo(i++);
        }
    }
}
