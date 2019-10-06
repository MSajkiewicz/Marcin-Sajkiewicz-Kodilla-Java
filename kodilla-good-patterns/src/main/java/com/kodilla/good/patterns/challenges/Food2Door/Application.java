package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        Order glutenFreeShopOrder = new Order(new GlutenFreeShop(), "Bread", 30);
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.orderProcess(glutenFreeShopOrder);

    }
}
