package com.intexsoft.lessons0812.abstractClass;

public class OverloadDemo {

	public void test(int a) {
		System.out.println("a = " + a);
	}

	public double test(double a) {

		System.out.println("a = " + a);
		return a * a;
	}

}
