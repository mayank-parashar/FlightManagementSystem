package models;

import lombok.Data;

@Data
public class Flight extends BaseTable {
    String number;
    Airline airline;
    int departureTime;
    int arrivalTime;

    String fromSector;
    String toSector;

    public Flight(
            String number,
            Airline airline,
            int departureTime,
            int arrivalTime,
            String fromSector,
            String toSector
    ) {
        this.number = number;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fromSector = fromSector;
        this.toSector = toSector;
    }
}
