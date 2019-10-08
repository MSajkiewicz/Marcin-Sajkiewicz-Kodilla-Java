package com.kodilla.good.patterns.challenges.Food2Door.order;

import com.kodilla.good.patterns.challenges.Food2Door.suppliers.Supplier;

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

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "supplier=" + supplier.toString() +
                ", item='" + item + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
