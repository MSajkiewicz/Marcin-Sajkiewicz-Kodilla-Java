package com.kodilla.good.patterns.challenges.challenge1.service;

import com.kodilla.good.patterns.challenges.challenge1.models.Item;
import com.kodilla.good.patterns.challenges.challenge1.models.User;

public class CarOrderService implements OrderService {
    @Override
    public boolean order(User user, Item item) {
        return true;
    }
}
