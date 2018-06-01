package ua.lpnuai.Mamchur08;

class Seats {

    private int seats;

    public Seats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    private boolean hasFreeSeats() {
        return seats > 0;
    }
}
