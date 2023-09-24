package models;

import lombok.Data;

enum BookingStatus {
    BOOKED,
    CANCELED,
    RESERVED,
}
@Data
public class Booking {
    User user;
    Flight flight;

    BookingStatus bookingStatus;

    public Booking(User user, Flight flight, BookingStatus bookingStatus) {
        this.user = user;
        this.flight = flight;
        this.bookingStatus = bookingStatus;
    }


}
