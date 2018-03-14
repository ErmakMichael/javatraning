package by.itcademy.jd2.jdk8samples._7_dates;

import java.time.ZoneId;

public class TimeZoneExample {

    public static void main(final String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        // prints all available timezone ids

        final ZoneId zone1 = ZoneId.of("Europe/Berlin");
        final ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());

        // ZoneRules[currentStandardOffset=+01:00]
        // ZoneRules[currentStandardOffset=-03:00]
    }
}
