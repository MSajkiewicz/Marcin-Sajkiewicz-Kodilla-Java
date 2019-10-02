package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warszawa", "Katowice");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found.");
        }
    }
}
