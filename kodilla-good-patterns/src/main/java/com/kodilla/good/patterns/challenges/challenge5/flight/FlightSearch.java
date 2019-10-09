package com.kodilla.good.patterns.challenges.challenge5.flight;

public class FlightSearch {
    private String departureAirportSearch;
    private String arrivalAirportSearch;
    private String transitAirportSearch;
    private FlightRepository flightRepository;

    public FlightSearch(String departureAirportSearch, String arrivalAirportSearch, String transitAirportSearch, FlightRepository flightRepository) {
        this.departureAirportSearch = departureAirportSearch;
        this.arrivalAirportSearch = arrivalAirportSearch;
        this.transitAirportSearch = transitAirportSearch;
        this.flightRepository = flightRepository;
    }

    public String getDepartureAirportSearch() {
        return departureAirportSearch;
    }

    public String getArrivalAirportSearch() {
        return arrivalAirportSearch;
    }

    public String getTransitAirportSearch() {
        return transitAirportSearch;
    }

    public FlightRepository getFlightRepository() {
        return flightRepository;
    }
}

