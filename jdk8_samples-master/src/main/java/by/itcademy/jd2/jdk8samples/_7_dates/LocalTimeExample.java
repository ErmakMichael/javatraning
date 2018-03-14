package by.itcademy.jd2.jdk8samples._7_dates;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(final String[] args) {
        final ZoneId zone1 = ZoneId.of("Europe/Berlin");
        final ZoneId zone2 = ZoneId.of("Brazil/East");

        final LocalTime now1 = LocalTime.now(zone1);
        final LocalTime now2 = LocalTime.now(zone2);

        System.out.println(now1.isBefore(now2)); // false

        final long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        final long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween); // -3
        System.out.println(minutesBetween); // -239
    }

}
