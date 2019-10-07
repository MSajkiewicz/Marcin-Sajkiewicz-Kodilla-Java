package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.models.Item;
import com.kodilla.good.patterns.challenges.models.User;

public class CarOrderService implements OrderService {
    @Override
    public boolean order(User user, Item item) {
        return true;
    }
}
