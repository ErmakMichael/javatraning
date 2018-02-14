package com.intexsoft.lessons1701.international;

import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {

	public static void main(String[] args) {

		Locale locale = new Locale("ru", "RU");
		
		NumberFormat format0 = NumberFormat.getCurrencyInstance(locale);
		System.out.println(format0.format(153.3));

		System.out.println();
		
		NumberFormat format1 = NumberFormat.getNumberInstance(locale);
		System.out.println(format1.format(15300000.33333));

		System.out.println();
		
		NumberFormat format2 = NumberFormat.getPercentInstance(locale);
		System.out.println(format2.format(15300000.33333));

	}

}
