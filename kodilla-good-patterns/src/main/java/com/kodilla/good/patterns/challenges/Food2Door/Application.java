package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.informationService.MailService;
import com.kodilla.good.patterns.challenges.Food2Door.order.Order;
import com.kodilla.good.patterns.challenges.Food2Door.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.Food2Door.orderRepository.OrderRepository;
import com.kodilla.good.patterns.challenges.Food2Door.orderService.OrderService;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.GlutenFreeShop;

public class Application {
    public static void main(String[] args) {
        Order glutenFreeShopOrder = new Order(new GlutenFreeShop(), "Bread", 30);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService(), new OrderRepository());

        orderProcessor.orderProcess(glutenFreeShopOrder);

    }
}

