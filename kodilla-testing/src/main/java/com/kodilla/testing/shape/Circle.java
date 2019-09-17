package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double radius;

    public Circle (int radius){
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return 3.14*radius*radius;

    }

}
