package com.kodilla.stream.invoice.simple;

public final class SimpleItem {
    private SimpleProduct product;
    private double quantity;

    public SimpleItem(final SimpleProduct product, final double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;
    }
}