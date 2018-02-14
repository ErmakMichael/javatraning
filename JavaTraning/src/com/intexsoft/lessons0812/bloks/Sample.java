package com.intexsoft.lessons0812.bloks;

public class Sample {

	private int objectId;

	static {											// срабатывает один раз
		System.out.println("inint block 1 of object "); // выполняется вначале конструктора а после конструктор
	}													// блоки инициализации

	public Sample(int i) {
		super();
		objectId = i;
		System.out.println("Constructor: " + i);
	}

	{
		System.out.println("inint block 2 of object " + objectId);
	}

}