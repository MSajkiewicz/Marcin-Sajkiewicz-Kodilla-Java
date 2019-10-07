package com.kodilla.good.patterns.challenges.repository;

import com.kodilla.good.patterns.challenges.models.Item;
import com.kodilla.good.patterns.challenges.models.User;

public class CarOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Item item) {
        System.out.println("Order created.");

    }
}
