package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;

public class ExtraFoodShop implements Supplier {
    public void process(Order order) {
        System.out.println("Order "+ order +" in ExtraFoodShop succeed!");
    }

    public String getMessage(){ return "Sending mail to ExtraFoodShop supplier"; }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
