package lesson16;

public class Day {
    private String dayOfWeek;
    private int number;

    public Day setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public Day setNumber(int number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return
                dayOfWeek + " - "
                + number
               ;
    }
}

