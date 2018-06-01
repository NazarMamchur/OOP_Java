package ua.lpnuai.Mamchur08;

import ua.lpnuai.Mamchur08.BusTime;
import ua.lpnuai.Mamchur08.DayWeek;
import ua.lpnuai.Mamchur08.Route;
import ua.lpnuai.Mamchur08.Seats;

public class Lab10 {

    private BusTime departure;
    private Number busNumber;
    private DayWeek day;
    private Seats freeSeats;
    private Route route;

    public Lab10(BusTime departure, Number busNumber, DayWeek day, Seats freeSeats, Route route) {
        this.departure = departure;
        this.busNumber = busNumber;
        this.day = day;
        this.freeSeats = freeSeats;
        this.route = route;
    }

    public BusTime getDeparture() {
        return departure;
    }

    public Number getBusNumber() {
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

