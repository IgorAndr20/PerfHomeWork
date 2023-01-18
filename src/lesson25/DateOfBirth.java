package lesson25;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;


public class DateOfBirth {


    public static void main(String[] args) {
        long start = System.nanoTime();
        Date dateOfBirth = new Date(91, 7, 20);
        System.out.println("Date " + "\n" + dateOfBirth);
        System.out.println(new SimpleDateFormat("HH-mm dd-MM-yyyy").format(dateOfBirth));
        System.out.println(new SimpleDateFormat("dd-MMMM-yy").format(dateOfBirth));
        System.out.println(new SimpleDateFormat("dd-MMMM-yyyy").format(dateOfBirth));
        System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(dateOfBirth));
        System.out.println(new SimpleDateFormat("yy-MMMM-dd").format(dateOfBirth));
        Date currentDate = new Date();
        long diff = TimeUnit.MILLISECONDS.toDays(currentDate.getTime() - dateOfBirth.getTime());
        System.out.println("Разница дат " + diff + " суток");
        long finish1 = System.nanoTime();
        long elapsed1 = (finish1 - start) / 1000;
        System.out.println("Время выполнения Date - " + elapsed1 + " ms" + "\n");


        long start2 = System.nanoTime();
        Calendar dateOfBirth2 = new GregorianCalendar(1991, 7, 20);
        System.out.println("Calendar " + dateOfBirth2.getTime());
        System.out.println(new SimpleDateFormat("HH-mm dd-MM-yyyy").format(dateOfBirth2.getTime()));
        System.out.println(new SimpleDateFormat("dd-MMMM-yy").format(dateOfBirth2.getTime()));
        System.out.println(new SimpleDateFormat("dd-MMMM-yyyy").format(dateOfBirth2.getTime()));
        System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(dateOfBirth2.getTime()));
        System.out.println(new SimpleDateFormat("yy-MMMM-dd").format(dateOfBirth2.getTime()));
        Calendar currentDate2 = Calendar.getInstance();
        long diff2 = TimeUnit.MILLISECONDS.toDays(currentDate2.getTimeInMillis() - dateOfBirth2.getTimeInMillis());
        System.out.println("Разница дат " + diff2 + " суток");
        long finish2 = System.nanoTime();
        long elapsed2 = (finish2 - start2) / 1000;
        System.out.println("Время выполнения Calendar - " + elapsed2 + " ms" + "\n");


        long start3 = System.nanoTime();
        LocalDate dateOfBirth3 = LocalDate.of(1991, 8, 20);
        System.out.println("LocalDate " + dateOfBirth3);
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MMMM-dd").format(dateOfBirth3));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dateOfBirth3));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(dateOfBirth3));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(dateOfBirth3));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dateOfBirth3));
        LocalDate currentDate3 = LocalDate.now();
        Period period3 = Period.between(currentDate3, dateOfBirth3);
        System.out.println("Разница дат " + period3 + " суток");
        long finish3 = System.nanoTime();
        long elapsed3 = (finish3 - start3) / 1000;
        System.out.println("Время выполнения LocalDate - " + elapsed3 + " ms" + "\n");

        long start4 = System.nanoTime();
        LocalDateTime dateOfBirth4 = LocalDateTime.of(1991, 8, 20, 0, 0);
        System.out.println("LocalDateTime " + dateOfBirth4);
        System.out.println(DateTimeFormatter.ofPattern("HH-mm dd-MM-yyyy").format(dateOfBirth4));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dateOfBirth4));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(dateOfBirth4));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(dateOfBirth4));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dateOfBirth4));
        LocalDateTime currentDate4 = LocalDateTime.now();
        long period4 = ChronoUnit.DAYS.between(currentDate4, dateOfBirth4);
        System.out.println("Разница дат " + period4 + " суток");
        long finish4 = System.nanoTime();
        long elapsed4 = (finish4 - start4) / 1000;
        System.out.println("LocalDateTime - " + elapsed4 + " ms" + "\n");


        long start5 = System.nanoTime();
        ZonedDateTime dateOfBirth5 = ZonedDateTime.of(1991, 8, 20, 0, 0, 0, 0, ZoneId.of("Asia/Baku"));
        System.out.println("ZoneDateTime " + dateOfBirth5);
        System.out.println(DateTimeFormatter.ofPattern("HH-mm dd-MM-yyyy").format(dateOfBirth5));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dateOfBirth5));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE.format(dateOfBirth5));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(dateOfBirth5));
        System.out.println(DateTimeFormatter.ISO_OFFSET_TIME.format(dateOfBirth5));
        ZonedDateTime currentDate5 = ZonedDateTime.now();
        long period5 = ChronoUnit.DAYS.between(currentDate5, dateOfBirth5);
        System.out.println("Разница дат " + period5 + " суток");
        long finish5 = System.nanoTime();
        long elapsed5 = (finish5 - start5) / 1000;
        System.out.println("ZonedDateTime - " + elapsed5 + " ms" + "\n");

        long finish = System.nanoTime();
        long elapsed = (finish - start) / 1000;
        System.out.println("AllTime - " + elapsed + " ms");

    }
}



