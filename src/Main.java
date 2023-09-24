import models.*;
import service.AirlineManager;
import service.FareTypeManager;
import service.FlightManager;
import service.SeatManager;

public class Main {
    public static void main(String[] args) {
        AirlineManager airlineManager = new AirlineManager();
        SeatManager seatManager = new SeatManager();
        FlightManager flightManager =  new FlightManager(seatManager);
        FareTypeManager fareTypeManager = new FareTypeManager();
        Airline airline1 = airlineManager.add("airline1");
        Flight flight1 = flightManager.add("flight1", airline1, 1, 1, "Delhi", "Mumbai");
        FareType faretypeBusiness = fareTypeManager.add("Business", 5000);
        FareType faretypeEconomy = fareTypeManager.add("Economy", 2500);
        seatManager.add("a1", faretypeBusiness, flight1);
        seatManager.add("a2", faretypeBusiness, flight1);
        seatManager.add("a3", faretypeEconomy, flight1);
        System.out.println("flight available for pax count 2 " + flightManager.searchFlights("Delhi", "Mumbai", 1, 2));
        System.out.println("flight available for pax count 5 " + flightManager.searchFlights("Delhi", "Mumbai", 1, 5));

        }
}
