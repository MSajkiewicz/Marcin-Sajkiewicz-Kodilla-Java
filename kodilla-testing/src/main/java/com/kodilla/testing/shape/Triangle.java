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
    public double getHeight() {
        return height*height*0.5;

    }
}