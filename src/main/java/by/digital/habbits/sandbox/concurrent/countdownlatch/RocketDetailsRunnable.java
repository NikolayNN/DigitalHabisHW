package by.digital.habbits.sandbox.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailsRunnable implements Runnable {
    private final CountDownLatch countDownLatch;
    private final RocketDetails rocketDetails;

    public RocketDetailsRunnable(CountDownLatch countDownLatch, RocketDetails rocketDetails) {
        this.countDownLatch = countDownLatch;
        this.rocketDetails = rocketDetails;
    }

    @Override
    public void run() {
        System.out.println("Готовится деталь: " + rocketDetails);
        try {
            Thread.sleep(1000);
            System.out.println("Деталь готова: " + rocketDetails);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
