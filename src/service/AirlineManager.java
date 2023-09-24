package service;

import models.Airline;

import java.util.ArrayList;

public class AirlineManager {
    ArrayList<Airline> airlines;

    public AirlineManager() {
        this.airlines = new ArrayList<>();
    }

    public Airline add(String number) {
        Airline airline = new Airline(number);
        airlines.add(airline);
        return airline;
    }
}
