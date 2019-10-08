package com.kodilla.good.patterns.challenges.repository;

import com.kodilla.good.patterns.challenges.models.Item;
import com.kodilla.good.patterns.challenges.models.User;

public interface OrderRepository {
    void createOrder(User user, Item item);

}
