package by.itcademy.jd2.jdk8samples._7_dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateExample {

    public static void main(final String[] args) {
        final LocalDate today = LocalDate.now();
        final LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        tomorrow.minusDays(2);

        final LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
        final DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println(dayOfWeek); // FRIDAY

        final DateTimeFormatter germanFormatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);

        final LocalDate xmas = LocalDate.parse("24.12.2014", germanFormatter);
        System.out.println(xmas); // 2014-12-24

    }

}
