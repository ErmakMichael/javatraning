package com.intexsoft.lessons0801.thread;

import com.intexsoft.lessons0801.thread.created1.MyThread;

public class Test {

	public static void main(String[] args) {

		System.out.println("Main thread started");
		//////////////////////////////////////////////
		// 1 способ создания

		MyThread myThread1 = new MyThread();
		// myThread1.setDaemon(true); //заканчиват работу с main методом
		myThread1.setName("Thread1_");
		// приоритет максимальный
		myThread1.setPriority(10);

		/////////////////////////////////////////////
		// 2 способ создания

		final Thread myThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name + " started:");

				int i = 0;
				while (i < 100) {
					i++;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(name + i);

				}

				System.out.println(name + " ended");
			}
		});
		myThread2.setName("Thread2_");
		myThread1.start();
		myThread2.start();

		System.out.println("Main thread ended");

	}

}
