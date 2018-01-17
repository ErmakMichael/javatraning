package com.intexsoft.lessons1701.collator;

import java.text.Collator;
import java.util.Locale;

public class Test1 {

	public static void main(String[] args) {
		
		
		Locale locale = new Locale("en");

		Collator collator = Collator.getInstance(locale);
		
		System.out.println(collator.compare("abc", "def"));
		
		
		
		
	}

}
