package com.intexsoft.lessons0812.abstractClass;

import java.io.Serializable;

public class PassenderCar extends Car implements Serializable, SampleInterface{
	@Override
	public void move() {
		System.out.println("I move fast");
	}
	
	
	
	

}
