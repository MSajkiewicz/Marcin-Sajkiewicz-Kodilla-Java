package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {
    private Supplier supplier;
    private String item;
    private int quantity;

    public Order(Supplier supplier, String item, int quantity) {
        this.supplier = supplier;
        this.item = item;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Order{" +
                "supplier=" + supplier +
                ", item='" + item + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
