package com.kodilla.good.patterns.challenges.challenge5.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchProcessor {
    private FlightRepository flightRepository;

    public FlightSearchProcessor(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public FlightRepository getFlightRepository() {
        return flightRepository;
    }

    public List<Flight> findByArrival(String arrival){
        return flightRepository.getFlightArrayList().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
    }
    public List<Flight> findByDeparture(String departure){
        return flightRepository.getFlightArrayList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure))
                .collect(Collectors.toList());
    }
    public List<Flight> findByDepartureAndTransit(String departure, String arrival){
        List<Flight> flightList = flightRepository.getFlightArrayList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure))
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
        return flightList;
    }

    public List<Flight> findWithTransit(String departure, String arrival, String transit) {
        List<Flight> flightsWithTransitList = new ArrayList<>();
        flightsWithTransitList.addAll(findByDepartureAndTransit(departure, transit));
        flightsWithTransitList.addAll(findByDepartureAndTransit(transit, arrival));
        return flightsWithTransitList;
    }

}
