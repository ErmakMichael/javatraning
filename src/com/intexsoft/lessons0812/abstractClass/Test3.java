package com.intexsoft.lessons0812.abstractClass;

public class Test3 {

	public static void main(String[] args) {

		PassenderCar passenderCar = new PassenderCar();
		Truck truck = new Truck();

		startTheCar(truck);
		startTheCar(passenderCar);
	}

	private static void startTheCar(PassenderCar passenderCar) {

		passenderCar.move();
	}

	private static void startTheCar(Truck truck) {

		truck.move();

	}
}
