package com.intexsoft.lessons0801.thread.chicken;

public class ChickenVoice // Класс с методом main()
{

	public static void main(String[] args) throws InterruptedException {
		EggVoice eggVoiceThread = new EggVoice(); // Создание потока
		System.out.println("Спор начат...");
		eggVoiceThread.start(); // Запуск потока

		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000); // Приостанавливает поток на 1 секунду

			System.out.println("курица!");
		}

		// Слово «курица» сказано 5 раз

		if (eggVoiceThread.isAlive()) // Если оппонент еще не сказал последнее слово
		{
			eggVoiceThread.join(); // Подождать пока оппонент закончит высказываться.

			System.out.println("Первым появилось яйцо!");
		} else {// если оппонент уже закончил высказываться
		
			System.out.println("Первой появилась курица!");
		}
		System.out.println("Спор закончен!");
	}
}