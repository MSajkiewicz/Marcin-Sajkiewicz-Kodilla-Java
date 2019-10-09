package com.kodilla.good.patterns.challenges.challenge5.flight;

public class FlightSearchProcessor {

    public static void flightSearching(FlightSearch flightSearch){
        if(flightSearch.getDepartureAirportSearch()!=null && flightSearch.getArrivalAirportSearch()!=null && flightSearch.getTransitAirportSearch()==null){
            flightSearch.getFlightRepository().getFlightArrayList().stream()
                    .filter(flight -> flight.getDepartureAirport().equals(flightSearch.getDepartureAirportSearch()))
                    .filter(flight -> flight.getArrivalAirport().equals(flightSearch.getArrivalAirportSearch()))
                    .forEach(System.out::println);

        } else if (flightSearch.getDepartureAirportSearch()==null && flightSearch.getArrivalAirportSearch()!=null && flightSearch.getTransitAirportSearch()==null) {
            flightSearch.getFlightRepository().getFlightArrayList().stream()
                    .filter(flight -> flight.getArrivalAirport().equals(flightSearch.getArrivalAirportSearch()))
                    .forEach(System.out::println);


        } else if (flightSearch.getDepartureAirportSearch()!=null && flightSearch.getArrivalAirportSearch()==null && flightSearch.getTransitAirportSearch()==null) {
            flightSearch.getFlightRepository().getFlightArrayList().stream()
                    .filter(flight -> flight.getDepartureAirport().equals(flightSearch.getDepartureAirportSearch()))
                    .forEach(System.out::println);


        } else if (flightSearch.getDepartureAirportSearch()!=null && flightSearch.getArrivalAirportSearch()!=null && flightSearch.getTransitAirportSearch()!=null) {
            System.out.println("1-st flight: ");
            flightSearch.getFlightRepository().getFlightArrayList().stream()
                    .filter(flight -> flight.getDepartureAirport().equals(flightSearch.getDepartureAirportSearch()))
                    .filter(flight -> flight.getArrivalAirport().equals(flightSearch.getTransitAirportSearch()))
                    .forEach(System.out::println);
            System.out.println("2-nd flight: ");
            flightSearch.getFlightRepository().getFlightArrayList().stream()
                    .filter(flight -> flight.getDepartureAirport().equals(flightSearch.getTransitAirportSearch()))
                    .filter(flight -> flight.getArrivalAirport().equals(flightSearch.getArrivalAirportSearch()))
                    .forEach(System.out::println);

        } else {
            System.out.println("Please enter missing condition.");
        }
    }

}
