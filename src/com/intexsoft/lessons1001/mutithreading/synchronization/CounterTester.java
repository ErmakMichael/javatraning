package com.intexsoft.lessons1001.mutithreading.synchronization;

public class CounterTester {
    public static void main(final String[] args) throws InterruptedException {
        final Counter counter = new Counter();
        for (int i = 0; i < 200; i++) {
            final CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(1000);

        System.out.println("Counter:" + counter.getCounter());
    }
}
class Counter {
    private long counter = 0L;		
    
    
    /*Atomic собирает воедино операции и не дает другим потокам вклиниться между операциями
    * i++ (минимум 3 операции: (((((чтение -увеличение - а)))))
    * volatile ОТКЛЮЧЕНИЕ ПЕРЕМЕННОЙ ИЗ КЭША В ПОТОКЕ
    * synchronized запускает потоки по очереди, использует монитор
    * 
    * 
    * 
    */														
    public synchronized void increaseCounter() {				
        counter++;
    }

    public long getCounter() {
        return counter;
    }
}



class CounterThread extends Thread {
    private final Counter counter;

    public CounterThread(final Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increaseCounter();
        }
    }
}