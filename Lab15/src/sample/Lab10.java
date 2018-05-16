package sample;

import java.lang.Number;

public class Lab10 {

    private BusTime departure;
    private BusNumber busNumber;
    private DayWeek day;
    private Seats freeSeats;
    private Route route;

    public Lab10(BusTime departure, BusNumber busNumber, DayWeek day, Seats freeSeats, Route route) {
        this.departure = departure;
        this.busNumber = busNumber;
        this.day = day;
        this.freeSeats = freeSeats;
        this.route = route;
    }

    public BusTime getDeparture() {
        return departure;
    }

    public BusNumber getBusNumber() {
        return busNumber;
    }

    public DayWeek getDay() {
        return day;
    }

    public Seats getFreeSeats() {
        return freeSeats;
    }

    public Route getRoute() {
        return route;
    }
}

