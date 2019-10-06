package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Supplier {
    public void process(Order order) {
        System.out.println("Order "+ order +" in GlutenFreeShop succeed!");
    }
}
