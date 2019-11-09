package com.kodilla.patterns.factory.tasks;

import java.io.IOException;
import java.util.InputMismatchException;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) throws MakeTaskException {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy water", "Water", 2.0);
            case PAINTINGTASK:
                return new PaintingTask("Paint landscape", "Blue", "Landscape");
            case DRIVINGTASK:
                return new DrivingTask("Drive home", "Home", "Car");
            default:
                throw new MakeTaskException();
        }

    }

}
