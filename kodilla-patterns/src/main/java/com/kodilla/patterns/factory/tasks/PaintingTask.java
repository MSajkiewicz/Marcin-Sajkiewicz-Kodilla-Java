package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        return "PaintingTask{" + taskName + "/" + color + "/" + whatToPaint + '}';
    }
}
