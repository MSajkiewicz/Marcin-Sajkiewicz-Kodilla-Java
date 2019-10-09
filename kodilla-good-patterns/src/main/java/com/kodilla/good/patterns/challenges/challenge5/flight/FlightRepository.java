package com.kodilla.good.patterns.challenges.challenge5.flight;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private List<Flight> flightArrayList = new ArrayList<>();

    public void addToFlightArrayList(Flight flight){
        flightArrayList.add(flight);
    }

    public List<Flight> getFlightArrayList(){
        return flightArrayList;

    }

}
