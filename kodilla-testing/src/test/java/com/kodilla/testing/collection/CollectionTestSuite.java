package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        String result = "";
        Random randomGenerator = new Random();
        ArrayList<Integer> randomNumberList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            int n = randomGenerator.nextInt(100);
            randomNumberList.add(n);
        }
        System.out.println("Test testOddNumbersExterminatorNormalList started!");
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(randomNumberList);
        ArrayList<Integer> createdEvenList = exterminator.getEvenList();
        //Then
        for (Integer evenNumber : createdEvenList) {
            Assert.assertTrue(evenNumber % 2 == 0);
        }
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        System.out.println("Test testOddNumbersExterminatorEmptyList started!");

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(emptyList);
        ArrayList<Integer> createdEmptyList = exterminator.getEvenList();

        //Then
        Assert.assertTrue(createdEmptyList.size()==(0));
    }


}