package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.models.Item;
import com.kodilla.good.patterns.challenges.models.User;

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
