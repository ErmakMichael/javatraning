package com.intexsoft.lessons0612.enum1;

public class EnumTest {

	public static void main(String[] args) {

		DayOfWeek monday = DayOfWeek.monday;
		String titleRu = monday.getTitleRu();

		System.out.println(monday.name());
		System.out.println(monday.ordinal());
		System.out.println(titleRu);
	}

}
