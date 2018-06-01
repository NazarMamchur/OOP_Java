package ua.lpnuai.Mamchur08;

class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isValid() {
        return this.number > 0;
    }


}
