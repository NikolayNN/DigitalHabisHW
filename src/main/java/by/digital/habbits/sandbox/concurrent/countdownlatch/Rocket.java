package by.digital.habbits.sandbox.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {
    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Ракета готовится к запуску");
        try {
            countDownLatch.await();
            System.out.println("Launch!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
