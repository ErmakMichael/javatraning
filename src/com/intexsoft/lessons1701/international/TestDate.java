package com.intexsoft.lessons1701.international;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Locale loc = new Locale("en");
		Date CurrentDate = new Date();

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
		System.out.println(df.format(CurrentDate));
		// parse

		System.out.println();

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, loc);
		System.out.println(df1.format(CurrentDate));

		System.out.println();

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT, loc);
		System.out.println(df2.format(CurrentDate));

		System.out.println();
		
		System.out.println(df.parse("Wednesday, January 17, 2018"));
	}

}
