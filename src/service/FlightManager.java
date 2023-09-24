package service;

import models.Airline;
import models.Flight;

import java.util.ArrayList;

public class FlightManager {
    ArrayList<Flight> flights;
    SeatManager seatManager;

    public FlightManager(SeatManager seatManager) {
        this.flights = new ArrayList<>();
        this.seatManager = seatManager;
    }

    public Flight add(String number,
               Airline airline,
               int departureTime,
               int arrivalTime,
               String fromSector,
               String toSector) {
        Flight flight = new Flight(number, airline, departureTime, arrivalTime, fromSector, toSector);
        this.flights.add(flight);
        return flight;
    }

    public ArrayList<Flight> searchFlights(String from, String to, int departDate, int paxCount) {
        ArrayList<Flight> avilableFlights = new ArrayList<>();
        for(Flight flight: this.flights) {
            if(
                    flight.getToSector().equalsIgnoreCase(to)
                            && flight.getFromSector().equalsIgnoreCase(from) &&
                            flight.getDepartureTime() == departDate
            ) {
                if (this.seatManager.getSeat(flight.getNumber()).size() >= paxCount) {
                    avilableFlights.add(flight);
                }
            }
        }
        return avilableFlights;
    }
}
