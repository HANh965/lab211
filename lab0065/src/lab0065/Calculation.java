package lab0065;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */


import java.util.*;

public class Calculation {

    // Function 1: createStudent
    public Student createStudent(String name, String classes, double maths, double chemistry, double physics) {
        return new Student(name, classes, maths, chemistry, physics);
    }

    // Function 2: averageStudent
    public List<Student> averageStudent(List<Student> students) {
        for (Student s : students) {
            s.calculateAverageAndType();
        }
        return students;
    }

    // Function 3: getPercentTypeStudent
    public HashMap<String, Double> getPercentTypeStudent(List<Student> students) {
        HashMap<String, Integer> count = new HashMap<>();
        for (Student s : students) {
            count.put(s.getType(), count.getOrDefault(s.getType(), 0) + 1);
        }

        HashMap<String, Double> percent = new HashMap<>();
        for (String t : Arrays.asList("A", "B", "C", "D")) {
            int c = count.getOrDefault(t, 0);
            double p = (double) c / students.size() * 100;
            percent.put(t, p);
        }

        System.out.println("--------Classification Info -----");
        for (String t : Arrays.asList("A", "B", "C", "D")) {
            System.out.printf("%s: %.1f%%\n", t, percent.get(t));
        }
        return percent;
    }
}
