package com.intexsoft.lessons1701.resorseBoundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {

		Locale loc = new Locale("ru","RU");
		ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", loc);

		System.out.println(rb.getString("greeting"));
		System.out.println(rb.getString("by"));

		

	}

}
