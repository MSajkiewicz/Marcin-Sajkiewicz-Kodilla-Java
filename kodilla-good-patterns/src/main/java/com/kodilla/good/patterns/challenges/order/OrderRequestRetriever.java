package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.models.Item;
import com.kodilla.good.patterns.challenges.models.User;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Marcin", "Sajkiewicz");
        Item item = new Item("Car");

        return new OrderRequest(user, item);
    }
}
