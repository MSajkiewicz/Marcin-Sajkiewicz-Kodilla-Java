package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;

public class GlutenFreeShop implements Supplier {
    public void process(Order order) {
        System.out.println("Order "+ order +" in GlutenFreeShop succeed!");
    }

    public String getMessage(){
        return "Sending mail to GlutenFreeShop supplier.";
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
