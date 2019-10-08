package com.kodilla.good.patterns.challenges.Food2Door.order;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;

public class OrderDto {
    private Order order;
    private boolean isOrdered;

    public OrderDto(Order order, boolean isOrdered) {
        this.order=order;
        this.isOrdered=isOrdered;
    }

}
