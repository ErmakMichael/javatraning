package com.intexsoft.lessons1001.mutithreading.interruption;

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

        incrementatorThread.interrupt();
        
        // переключатель остановки потока interrupt
    }
}
