package com.kodilla.good.patterns.challenges.challenge5;

import com.kodilla.good.patterns.challenges.challenge5.flight.Flight;
import com.kodilla.good.patterns.challenges.challenge5.flight.FlightRepository;
import com.kodilla.good.patterns.challenges.challenge5.flight.FlightSearch;
import com.kodilla.good.patterns.challenges.challenge5.flight.FlightSearchProcessor;

public class Application {
    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();
        flightRepository.addToFlightArrayList(new Flight("Katowice", "Warszawa"));
        flightRepository.addToFlightArrayList(new Flight ("Warszawa", "Katowice"));
        flightRepository.addToFlightArrayList(new Flight ("Kraków", "Warszawa"));
        flightRepository.addToFlightArrayList(new Flight ("Warszawa", "Kraków"));
        flightRepository.addToFlightArrayList(new Flight ("Katowice", "Gdańsk"));
        flightRepository.addToFlightArrayList(new Flight ("Gdańsk", "Katowice"));

        FlightSearchProcessor.flightSearching(new FlightSearch("Katowice", "Kraków", "Warszawa", flightRepository));


    }
}
