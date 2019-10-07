package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.models.Item;
import com.kodilla.good.patterns.challenges.models.User;

public interface OrderService {
    boolean order(User user, Item item);
}
