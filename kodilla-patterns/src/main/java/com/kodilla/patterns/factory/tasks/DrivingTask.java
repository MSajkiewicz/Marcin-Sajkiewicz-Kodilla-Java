package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;
    private boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Task " + taskName + "has been executed");
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return null;
    }

    @Override
    public boolean isTaskExecuted() {
        if(taskExecuted) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "DrivingTask{" + taskName + "/" + where + "/" + using + '}';
    }
}
