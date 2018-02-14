package com.intexsoft.lessons0812.abstractClass;

public class Car implements Movable{
	private String carBrand;

	public void move() {
		System.out.println("I can move");
	}

	public String getCarBrand() {
		return carBrand;
	}

}
