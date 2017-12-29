package com.intexsoft.lessons0612;

import java.util.Calendar;
import java.util.Date;

public class Calendarr {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date dateFromCalendar = calendar.getTime();
		System.out.println(dateFromCalendar);

		calendar.add(Calendar.HOUR_OF_DAY, -26);
		System.out.println(calendar.getTime() + "shifted date: ");

	}

}
