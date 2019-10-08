package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;

public interface Supplier {
    void process(Order order);

    String getMessage();
}
