package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfPossibleFlights = new HashMap<>();
        mapOfPossibleFlights.put("Krakow", true);
        mapOfPossibleFlights.put("Katowice", true);
        mapOfPossibleFlights.put("Gdansk", false);

        Boolean result = mapOfPossibleFlights.get(flight.getArrivalAirport());
        if (result != null) {
            System.out.println(result);
        } else {
            throw new RouteNotFoundException();
        }

    }
}