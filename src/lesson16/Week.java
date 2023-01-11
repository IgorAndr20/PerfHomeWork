package lesson16;

public class Week {
    int numberWeek;
    private Day day1;
    private Day day2;
    private Day day3;
    private Day day4;
    private Day day5;
    private Day day6;
    private Day day7;

    public Week(int numberWeek, int day1, int day2, int day3, int day4, int day5, int day6, int day7) {
        this.numberWeek = numberWeek;
        this.day1 = new Day().setDayOfWeek(DaysOfWeek.DAY1).setNumber(day1);
        this.day2 = new Day().setDayOfWeek(DaysOfWeek.DAY2).setNumber(day2);
        this.day3 = new Day().setDayOfWeek(DaysOfWeek.DAY3).setNumber(day3);
        this.day4 = new Day().setDayOfWeek(DaysOfWeek.DAY4).setNumber(day4);
        this.day5 = new Day().setDayOfWeek(DaysOfWeek.DAY5).setNumber(day5);
        this.day6 = new Day().setDayOfWeek(DaysOfWeek.DAY6).setNumber(day6);
        this.day7 = new Day().setDayOfWeek(DaysOfWeek.DAY7).setNumber(day7);
    }

    @Override
    public String toString() {
        return
                "Неделя " + numberWeek + " :\n" +
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