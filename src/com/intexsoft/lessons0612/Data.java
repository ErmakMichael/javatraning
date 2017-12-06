package com.intexsoft.lessons0612;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		System.out.println("default local date string" + date);
		System.out.println("current time in millis" + date.getTime());

		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss");
		
		System.out.println("formatted date: " + simpleDateFormat.format(date));
		
		String strDate = "2017-12-06 T 21:07:02";
		Date parsedDate = simpleDateFormat.parse(strDate);
		System.out.println("parseDate: " + parsedDate.getTime());
		
		
		
		
		
		
		
		
	}

}
