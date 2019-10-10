package com.kodilla.good.patterns.challenges.challenge5;

import com.kodilla.good.patterns.challenges.challenge5.flight.Flight;
import com.kodilla.good.patterns.challenges.challenge5.flight.FlightRepository;
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

        FlightSearchProcessor flightSearchProcessor = new FlightSearchProcessor(flightRepository);
        System.out.println(FlightSearchProcessor.findByArrival("Katowice"));
        System.out.println(FlightSearchProcessor.findByDeparture("Katowice"));
        System.out.println(FlightSearchProcessor.findWithTransit("Katowice", "Kraków", "Warszawa"));



    }
}
