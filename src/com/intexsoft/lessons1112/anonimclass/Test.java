package com.intexsoft.lessons1112.anonimclass;

public class Test {

	public static void main(String[] args) {
		IFunction action1 = new IFunction() {
			@Override
			public void doAction() {
				System.out.println("action1");
			}
		};

		IFunction action2 = new IFunction() {
			@Override
			public void doAction() {
				System.out.println("action2");
                                                                                                                                                                                                                                                                                                                          			}
		};

		execute(action1);
		execute(action2);

	}

	private static void execute(IFunction functionHolder) {

		functionHolder.doAction();

	}

}
