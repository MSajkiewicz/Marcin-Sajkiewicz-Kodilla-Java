package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int height;

    public Triangle (int height){
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return height*height*0.5;

    }
}