package by.digital.habbits.sandbox.multithreading.start;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(0, 100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello: " + Thread.currentThread().getName());
    }
}
