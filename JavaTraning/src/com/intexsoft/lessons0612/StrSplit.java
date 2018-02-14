package com.intexsoft.lessons0612;

public class StrSplit {

	public static void main(String[] args) {

		String str = "Test   hjklhkl hjlkj jkl";
		String[] words = str.split(" +");
		for (String word : words) {
			System.out.print(word + ", ");
		}

	}

}
