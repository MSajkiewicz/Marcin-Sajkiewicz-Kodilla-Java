package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> evenList = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) evenList.add(number);
        }
    }

    public ArrayList<Integer> getEvenList(){
        return evenList;
    }

}
