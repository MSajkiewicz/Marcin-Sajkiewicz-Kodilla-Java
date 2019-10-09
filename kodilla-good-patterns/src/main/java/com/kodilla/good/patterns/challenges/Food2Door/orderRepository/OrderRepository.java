package com.kodilla.good.patterns.challenges.Food2Door.orderRepository;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;

public class OrderRepository {
    public void addToRepository(Order order){
        System.out.println("Adding order " + order + " to repository.");
    }
}
