package com.kodilla.good.patterns.challenges.challenge1.order;

import com.kodilla.good.patterns.challenges.challenge1.models.Item;
import com.kodilla.good.patterns.challenges.challenge1.models.User;

public class OrderRequest {
    private User user;
    private Item item;

    public OrderRequest(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }
}
