package com.intexsoft.mutithreading.wait_notify;

public class WaitNotifyTest {

    public static void main(final String[] args) {
        final Message msg = new Message("обработать");
        final Waiter waiter = new Waiter(msg);
        new Thread(waiter, "waiter1").start();

        final Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter2").start();

        final Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("Стартовали все потоки");
    }

}