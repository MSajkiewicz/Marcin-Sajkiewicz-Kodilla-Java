package com.kodilla.patterns2.decorator.pizza;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {
    private PizzaOrder theOrder = new BasicPizzaOrder();

    @Before
    public void pizzaMaker() {
        //Given
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new PeperoniPizzaOrderDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);
    }

    @Test
    public void testPizzaOrderWithIngredientsGetCost() {
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(theCost, new BigDecimal(24));
    }
    @Test
    public void testPizzaOrderWithIngredientsGetDescription() {
        //When
        String theDescription = theOrder.getIngredients();
        //Then
        assertEquals(theDescription, "Składniki: ciasto, ser, sos pomidorowy, dodatkowy ser, peperoni, szynka");
    }
}