package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;

public class HealthyShop implements Supplier {
    public void process(Order order) {
        System.out.println("Order "+ order +" in HealthyShop succeed!");
    }

    public String getMessage(){
        return "Sending mail to HealthyShop supplier";
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
