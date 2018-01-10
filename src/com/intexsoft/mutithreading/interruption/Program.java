package com.itacademy.task26.multithreading.step1;

public class Program {

    public static void main(final String[] args) {
        final Incremenator incrementatorThread = new Incremenator();
        incrementatorThread.start();

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);
            } catch (final InterruptedException e) {
            }

            incrementatorThread.changeAction();
        }

        incrementatorThread.finish(); // =>incrementatorThread.interrupt();
    }
}
