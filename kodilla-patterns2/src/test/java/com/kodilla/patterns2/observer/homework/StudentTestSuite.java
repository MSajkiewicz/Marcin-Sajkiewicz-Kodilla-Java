package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class StudentTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student adam = new Student("Adam");
        Student ewa = new Student("Ewa");
        Student kamil = new Student("Kamil");
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");

        adam.registerObserver(mentor1);
        ewa.registerObserver(mentor1);
        kamil.registerObserver(mentor2);
        ewa.registerObserver(mentor2);

        //When
        adam.addTask("Zadanie 1");
        ewa.addTask("Zadanie 2");
        ewa.addTask("Zadanie 4");
        kamil.addTask("Zadanie 1");
        kamil.addTask("Zadanie 3");

        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(4, mentor2.getUpdateCount());
    }


}
