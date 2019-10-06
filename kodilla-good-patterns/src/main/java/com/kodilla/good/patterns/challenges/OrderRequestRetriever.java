package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Marcin", "Sajkiewicz");
        Item item = new Item("Car");

        return new OrderRequest(user, item);
    }
}
