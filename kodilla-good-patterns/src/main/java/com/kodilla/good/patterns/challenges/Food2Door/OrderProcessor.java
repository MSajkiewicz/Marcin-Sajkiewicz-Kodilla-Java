package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    public void orderProcess(Order order) {
        order.getSupplier().process(order);


    }


}
