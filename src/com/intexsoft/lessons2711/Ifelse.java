package com.intexsoft.lessons2711;

public class Ifelse {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		int c = 10;

		if (a > b) {
			compareAandBandC(a, c);
		} else {
			compareAandBandC(b, c);
		}

	}

	private static void compareAandBandC(int a, int c) {
		if (a > c) {
			System.out.println("max: " + a);
		} else {
			System.out.println("max: " + c);
		}
	}

}
