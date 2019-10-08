package com.kodilla.good.patterns.challenges.challenge1.repository;

import com.kodilla.good.patterns.challenges.challenge1.models.Item;
import com.kodilla.good.patterns.challenges.challenge1.models.User;

public interface OrderRepository {
    void createOrder(User user, Item item);

}
