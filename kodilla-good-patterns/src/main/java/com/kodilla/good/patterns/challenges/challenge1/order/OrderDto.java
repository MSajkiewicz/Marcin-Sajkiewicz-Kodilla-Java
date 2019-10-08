package com.kodilla.good.patterns.challenges.challenge1.order;

import com.kodilla.good.patterns.challenges.challenge1.models.User;

public class OrderDto {
    public User user;
    public boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
