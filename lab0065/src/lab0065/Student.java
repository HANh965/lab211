/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0065;

/**
 *
 * @author ADMIN
 */

public class Student {
    private String name;
    private String classes;
    private double maths;
    private double chemistry;
    private double physics;
    private double average;
    private String type;

    public Student(String name, String classes, double maths, double chemistry, double physics) {
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public double getAverage() {
        return average;
    }

    public String getType() {
        return type;
    }

    public void calculateAverageAndType() {
        average = (maths + chemistry + physics) / 3;
        if (average > 7.5)
            type = "A";
        else if (average >= 6)
            type = "B";
        else if (average >= 4)
            type = "C";
        else
            type = "D";
    }

    public void displayInfo(int index) {
        System.out.println("------ Student" + index + " Info ------");
        System.out.println("Name:" + name);
        System.out.println("Classes:" + classes);
        System.out.printf("AVG:%.1f\n", average);
        System.out.println("Type:" + type);
    }
}
