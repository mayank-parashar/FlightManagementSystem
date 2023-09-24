package models;

import lombok.Data;

@Data
public class Seat extends BaseTable{
    String number;
    SeatStatus status;
    FareType fareType;
    Flight flight;

    Booking booking = null;

    public Seat(String number, FareType fareType, Flight flight) {
        this.number = number;
        this.fareType = fareType;
        this.flight = flight;
        this.status = SeatStatus.AVAILABLE;
    }

    public boolean bookSeat(Booking booking) {
        synchronized (this) {
            if(this.status == SeatStatus.AVAILABLE && this.booking == null) {
                this.status = SeatStatus.BOOKED;
                this.booking = booking;
                return true;
            }
        }
        return false;
    }

}
