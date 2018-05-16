package sample;

class BusNumber {

    private int number;

    public BusNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isValid() {
        return this.number > 0;
    }


}
