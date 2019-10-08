package com.kodilla.good.patterns.challenges.challenge1.repository;

import com.kodilla.good.patterns.challenges.challenge1.models.Item;
import com.kodilla.good.patterns.challenges.challenge1.models.User;

public class CarOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Item item) {
        System.out.println("Order created.");

    }
}
