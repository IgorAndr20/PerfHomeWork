package lesson16Enum;

public enum DaysOfWeek {
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота"),
    SUNDAY ("Воскресенье");

    private String title;

    DaysOfWeek(String title) {
        this.title = title;
    }

    public DaysOfWeek setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return  title;
    }
}
