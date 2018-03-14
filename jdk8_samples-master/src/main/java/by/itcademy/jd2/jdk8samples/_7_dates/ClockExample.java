package by.itcademy.jd2.jdk8samples._7_dates;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class ClockExample {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);   // legacy java.util.Date
    }

}
