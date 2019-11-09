package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskFactoryTestSuite {


    @Test
    public void testFactoryShoppingTask() throws MakeTaskException {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("ShoppingTask{Buy water/Water/2.0}", shoppingTask.toString());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask() throws MakeTaskException {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("PaintingTask{Paint landscape/Blue/Landscape}", paintingTask.toString());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask() throws MakeTaskException {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("DrivingTask{Drive home/Home/Car}", drivingTask.toString());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
