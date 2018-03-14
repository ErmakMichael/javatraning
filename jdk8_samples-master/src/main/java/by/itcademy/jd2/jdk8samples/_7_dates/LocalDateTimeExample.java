package by.itcademy.jd2.jdk8samples._7_dates;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDateTimeExample {

    public static void main(final String[] args) {
        final LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59,
                59);

        final DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        System.out.println(dayOfWeek); // WEDNESDAY

        final Month month = sylvester.getMonth();
        System.out.println(month); // DECEMBER

        final long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay); // 1439

        final Instant instant = sylvester.atZone(ZoneId.systemDefault()).toInstant();

        final Date legacyDate = Date.from(instant);
        System.out.println(legacyDate); // Wed Dec 31 23:59:59 CET 2014

        final DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("MMM dd, yyyy - HH:mm");

        final LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13",
                formatter);
        final String string = formatter.format(parsed);
        System.out.println(string); // Nov 03, 2014 - 07:13

    }

}
