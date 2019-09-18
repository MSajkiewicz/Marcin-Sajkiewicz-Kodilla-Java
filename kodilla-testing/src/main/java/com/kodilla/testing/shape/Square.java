package com.kodilla.testing.shape;

public class Square implements Shape {
     private int height;

    public Square (int height){
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return height*height;

    }
}