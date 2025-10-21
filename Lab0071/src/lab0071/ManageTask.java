/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0071;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ManageTask {
    
    ArrayList<Task> taskList = new ArrayList<>();
    Utility utility = new Utility();
    
    
    void inputTask() {
        String name = utility.getString("Enter name: ", "Wrong", utility.REGEX_STRING);
        int taskType = utility.getInt("Task Type: ", "Wrong", "Wrong", "Wrong", 1, 4);
        String date = utility.getDate();
        double from = utility.getDouble("From: ", "Wrong", "Wrong", "Wrong",
                8, 17);
        double to = utility.getDouble("Enter to: ", "Wrong", "Wrong", "Wrong", from + 0.5,
                17.5);
        String assignee = utility.getString("Enter assignee: ", "Wrong", utility.REGEX_STRING);
        String reviewer = utility.getString("Enter reviewer: ", "Wrong", utility.REGEX_STRING);

        if (checkOverlaps(date, assignee, from, to)) {
            System.out.println("Overlaps task !!");
        } else {
            Task newTask = new Task(taskType, name, date, from, to, assignee, reviewer);
            taskList.add(newTask);
            System.out.println("Add successfull !!");
        }

    }

    //ham de kiem tra xem tat ca cac thuoc tinh nhap vao co ko bi overlaps ko
    // => true => bi overlaps
    // => false => ko bi overlaps
    public boolean checkOverlaps(String date, String assignee, double from, double to) {

        //parameter: ki hieu la 2
        //task in list: ki hieu la 1
        for (Task task : taskList) {
            //if date and assignee of task equal to parameter then compare to plan To
            if (task.getDate().equals(date) && task.getAssignee().equals(assignee)) {
                if (from > task.getFrom() && from < task.getTo()) {
                    return true;
                }
            }
        }
        return false;
    }

    void deleteTask() {
        int id = utility.getInt("Enter id: ", "Wrong", "Wrong", "Wrong", 0, Integer.MAX_VALUE);
        
        Task taskFound = null;
        for (Task task : taskList) {
            if (task.getId() == id) {
                taskFound = task;
                break;
            }
        }
        
        if (taskFound == null) {
            System.out.println("NOT FOUND !!");
        }else {
            taskList.remove(taskFound);
        }
    }

    void displayTask() {
        System.out.printf("%-7s %-15s %-15s %-15s %-15s %-15s %-15s\n", "ID", "Name","Task", "Date", "Time","Assignee", "Reviewer");

        for (Task task : taskList) {
            System.out.println(task);
        }
    }

   
    

}