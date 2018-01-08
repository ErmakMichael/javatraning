package com.intexsoft.lessons0801.thread.created1;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		String threadName = getName();
		boolean daemon = isDaemon();
		
		System.out.println(Thread.currentThread().getName() + " started:");
		
		
		int i = 0;
		while (i < 100) {
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		
		
		System.out.println(Thread.currentThread().getName() + " ended");
		
	}
	

}

