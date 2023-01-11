package lesson16Enum;

public class Day {

    private DaysOfWeek dayOfWeek;
    private int number;


    public Day setDaysOfWeek(DaysOfWeek title) {
        this.dayOfWeek = title;
        return this;
    }

    public Day setNumber(int number) {
        this.number = number;
        return this;
    }



    @Override
    public String toString() {
        return dayOfWeek + " - " +
                number ;
    }
}
