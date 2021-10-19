package sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {
    private String taskName;
    private String taskDescription;
    private LocalDate date;
    private  DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
    public Event (LocalDate date, String taskName, String taskDescription){
        this.setDate(date);
        this.setTaskName(taskName);
        this.setTaskDescription(taskDescription);
    }




    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDate() {

        return date;
    }

    public void setDate(LocalDate date) {

        this.date = date;
    }
    @Override
    public String toString (){

        return this.getDate().format(formatters)+" - "+" - "+ getTaskName()+" - " + getTaskDescription();
    }
}
