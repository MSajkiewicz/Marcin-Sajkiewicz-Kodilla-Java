package com.kodilla.good.patterns.challenges.challenge5.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchProcessor {
    private static FlightRepository flightRepository;

    public FlightSearchProcessor(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public static List<Flight> findByArrival(String arrival){
        return flightRepository.getFlightArrayList().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
    }
    public static List<Flight> findByDeparture(String departure){
        return flightRepository.getFlightArrayList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure))
                .collect(Collectors.toList());
    }
    public static List<Flight> findWithTransit(String departure, String arrival, String transit) {
        List<Flight> firstFlight = flightRepository.getFlightArrayList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure))
                .filter(flight -> flight.getArrivalAirport().equals(transit))
                .collect(Collectors.toList());
        List<Flight> secondFlight = flightRepository.getFlightArrayList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(transit))
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
        List<Flight> flightsWithTransitList = new ArrayList<>();
        flightsWithTransitList.addAll(firstFlight);
        flightsWithTransitList.addAll(secondFlight);
        return flightsWithTransitList;
    }

}
