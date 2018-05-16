package sample;

class Direction {

    private String station;
    private String arrivalTime;

    public Direction(String station, String arrivalTime) {
        this.station = station;
        this.arrivalTime = arrivalTime;
    }

    public String getStation() {
        return station;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
}
