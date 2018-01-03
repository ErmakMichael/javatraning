package com.intexsoft.lessons2912.MyExeption;

public class Test {

	public static void main(String[] args) {
		try {
			methods1();
			System.out.println("exeption didnt accur");
			return;
		} catch (MyExeption e) {
			System.out.println("exeption was caught: " + e.getClass().getSimpleName());
		} finally { // выполняется всегда
			System.out.println("finally executed");
		}

		System.out.println("method 'main' ended");

	}

	private static void methods1() throws MyExeption {
		System.out.println("method1 started");
		method2();
		System.out.println("method1 complited");
	}

	private static void method2() throws MyExeption {
		System.out.println("method2 started");

		method3();

		System.out.println("method2 complited");
	}

	private static void method3() throws MyExeption {
		System.out.println("method3 started");

		MyExeption myExeption = new MyExeption();

		// throw myExeption;

	}

}
