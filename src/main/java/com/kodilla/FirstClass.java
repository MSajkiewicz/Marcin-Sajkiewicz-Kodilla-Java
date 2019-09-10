package com.kodilla;

public class FirstClass {


    public int GetSum(int a, int b) {
        int sum = 0;

        if (a == b) {
            return a;
        }
        if (a < b) {
            for (int i = a; i < b + 1; i++) {
                sum += a;
                return sum;
            }
            if (a > b) {
                for (int i = b; i < a + 1; i++) {
                    sum += b;
                    return sum;
                }
            }

        }


    }
}