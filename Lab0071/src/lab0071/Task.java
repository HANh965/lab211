/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0071;

/**
 *
 * @author ADMIN
 */
public class Task {
    private static int autoIncrement = 1;
    private int id;
    private int taskType;
    private String name, date;
    private double from, to;
    private String assignee, reviewer;

    public Task(int taskType, String name, String date, double from, double to, String assignee, String reviewer) {
        this.id = autoIncrement++;
        this.taskType = taskType;
        this.name = name;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public int getTaskType() {
        return taskType;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getTaskTypeString() {
        String result = null;

        switch (taskType) {
            case 1:
                result = "Code";
                break;
            case 2:
                result = "Test";
                break;
            case 3:
                result = "Design";
                break;
            case 4:
                result = "Review";
                break;
        }
        return result;

    }

    // Trong file Task.java

    @Override
    public String toString() {
        // SỬA LỖI: Cột "Time" là thời lượng (To - From)
        double duration = to - from;
        String time = String.format("%.1f", duration); // Định dạng thời lượng về 1 chữ số thập phân
        
        // Định dạng 7 cột theo yêu cầu (Phần này bạn đã làm đúng)
        return String.format("%-7s %-15s %-15s %-15s %-15s %-15s %-15s", 
                id, name, getTaskTypeString(), date, time, assignee, reviewer);
    }
    
    

}