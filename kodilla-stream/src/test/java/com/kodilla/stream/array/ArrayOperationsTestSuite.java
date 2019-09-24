package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        // Given
        int[] numbers = {4, 3, 6, 45, 67, 54, 11, 45, 23, 10};

        // When
        ArrayOperations.getAverage(numbers);

        // Then
        Assert.assertEquals(26.8, ArrayOperations.getAverage(numbers), 0);

    }

}
