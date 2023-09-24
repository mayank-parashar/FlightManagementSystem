package service;

import models.*;

import java.util.ArrayList;

public class SeatManager {
    ArrayList<Seat> seats;

    public SeatManager() {
        this.seats = new ArrayList<>();
    }

    public Seat add(String number, FareType fareType, Flight flight) {
        Seat seat = new Seat(number, fareType, flight);
        this.seats.add(seat);
        return seat;
    }

    public boolean bookSeat(Seat seat, Booking booking) {
        return seat.bookSeat(booking);
    }

    public ArrayList<Seat> getSeat(String flightNumber, String fareType) {
        ArrayList<Seat> availableSeat = new ArrayList<>();
        for(Seat seat: this.seats) {
            if(
                    seat.getFlight().getNumber().equals(flightNumber) &&
                            seat.getFareType().getFareType().equals(fareType) &&
                            seat.getStatus() == SeatStatus.AVAILABLE
            ) {
                availableSeat.add(seat);
            }
        }
        return availableSeat;
    }

    public ArrayList<Seat> getSeat(String flightNumber) {
        ArrayList<Seat> availableSeat = new ArrayList<>();
        for(Seat seat: this.seats) {
            if(
                    seat.getFlight().getNumber().equals(flightNumber) &&
                            seat.getStatus() == SeatStatus.AVAILABLE
            ) {
                availableSeat.add(seat);
            }
        }
        return availableSeat;
    }
}
