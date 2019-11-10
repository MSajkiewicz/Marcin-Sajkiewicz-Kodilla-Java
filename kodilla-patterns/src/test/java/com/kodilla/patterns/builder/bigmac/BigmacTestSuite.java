package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("classic")
                .burgers(2)
                .sauce("standard")
                .ingredient("cheese")
                .ingredient("onion")
                .build();
        System.out.println(bigmac);
        //When
        String bigmacToString = bigmac.toString();
        //Then
        Assert.assertEquals("Bigmac{bun='classic', burgers=2, sauce='standard', ingredients=[cheese, onion]}", bigmacToString);
    }
}
