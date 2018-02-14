package com.intexsoft.lessons1701.international;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru");

		NumberFormat numFormat = NumberFormat.getNumberInstance(locale);

		Number num = numFormat.parse("10,5");

		double n = num.doubleValue();

		System.out.println(n);
	}

}
