package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsList = new ArrayList<>();

    public void continentAdd(Continent continent){
        continentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continentsList.stream()
                .flatMap(continent -> continent.getContinentCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
