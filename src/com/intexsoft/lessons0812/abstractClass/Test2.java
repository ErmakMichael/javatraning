package com.intexsoft.lessons0812.abstractClass;

public class Test2 {


	public static void main(String[] args) {

		OverloadDemo od = new OverloadDemo();
		
		double doubleResult = od.test(1d);
		
		double intResult = od.test(2d);
		
		System.out.println(doubleResult + intResult);
	}

}
