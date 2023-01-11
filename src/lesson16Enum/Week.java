package lesson16Enum;

public class Week {
    private int numberWeek;
    private Day day1;
    private Day day2;
    private Day day3;
    private Day day4;
    private Day day5;
    private Day day6;
    private Day day7;


    public Week(int numberWeek, int day1, int day2, int day3, int day4, int day5, int day6, int day7) {
        this.numberWeek = numberWeek;
        this.day1 = new Day().setDaysOfWeek(DaysOfWeek.MONDAY).setNumber(day1);
        this.day2 = new Day().setDaysOfWeek(DaysOfWeek.TUESDAY).setNumber(day2);
        this.day3 = new Day().setDaysOfWeek(DaysOfWeek.WEDNESDAY).setNumber(day3);
        this.day4 = new Day().setDaysOfWeek(DaysOfWeek.THURSDAY).setNumber(day4);
        this.day5 = new Day().setDaysOfWeek(DaysOfWeek.FRIDAY).setNumber(day5);
        this.day6 = new Day().setDaysOfWeek(DaysOfWeek.SATURDAY).setNumber(day6);
        this.day7 = new Day().setDaysOfWeek(DaysOfWeek.SUNDAY).setNumber(day7);
    }

    @Override
    public String toString() {
        return "Неделя " + numberWeek + " :\n" +
                day1 + "\n" +
                day2 + "\n" +
                day3 + "\n" +
                day4 + "\n" +
                day5 + "\n" +
                day6 + "\n" +
                day7
                ;
    }


}
