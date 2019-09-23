package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> continentCountriesList;


    public Continent(final String continentName, final List<Country> continentCountriesList) {
        this.continentName = continentName;
        this.continentCountriesList = continentCountriesList;
    }

    public List<Country> getContinentCountriesList() {
        return continentCountriesList;
    }
}
