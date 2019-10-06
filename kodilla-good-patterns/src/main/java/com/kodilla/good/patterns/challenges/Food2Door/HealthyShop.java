package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Supplier {
    public void process(Order order) {
        System.out.println("Order "+ order +" in HealthyShop succeed!");
    }
}
