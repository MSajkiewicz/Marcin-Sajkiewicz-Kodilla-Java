package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void TestGetPeopleQuantity(){
        // Given
        World world = new World();
        List<Country> africaCountriesList = new ArrayList<>();
        africaCountriesList.add(new Country("Egipt", (new BigDecimal("5421518")) ));
        africaCountriesList.add(new Country("Libya", (new BigDecimal("3421518")) ));
        africaCountriesList.add(new Country("Algeria", (new BigDecimal("104521518")) ));
        world.continentAdd(new Continent("Africa", africaCountriesList));

        List<Country> europeCountriesList = new ArrayList<>();
        europeCountriesList.add(new Country("Poland", (new BigDecimal("5421518")) ));
        europeCountriesList.add(new Country("Germany", (new BigDecimal("3421518")) ));
        europeCountriesList.add(new Country("Ukraine", (new BigDecimal("104521518")) ));
        world.continentAdd(new Continent("Europe", europeCountriesList));

        // When
        BigDecimal calculatedPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("226729108");

        // Then
        Assert.assertEquals(expectedPeopleQuantity, calculatedPeopleQuantity);
    }
}
