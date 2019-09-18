package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle( 5);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapeListQuantity());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCollector.getShapeListQuantity());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        shapeCollector.addFigure(circle);
        //When & Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));

    }
    @Test
    public void getShapeListQuantity() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle( 5);
        Triangle triangle = new Triangle (10);
        Square square = new Square(23);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(3, shapeCollector.getShapeListQuantity());

    }

}
