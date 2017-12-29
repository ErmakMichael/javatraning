package com.intexsoft.lessons0612;

public class StrBuildMass {

	public static void main(String[] args) {

		int[] array = {0, 1, 2, 3, 4, 5 };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			int arrayElement = array[i];

			sb.append(arrayElement);
			if (i < array.length - 1) {
				sb.append(",");

			}
		}
		System.out.println(sb.toString());
		

	}

}
