package by.digital.habbits.sandbox.concurrent.barrier.countdownlatch;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailsRunnable implements Runnable {
    private final CyclicBarrier cyclicBarrier;
    private final RocketDetails rocketDetails;

    public RocketDetailsRunnable(CyclicBarrier cyclicBarrier, RocketDetails rocketDetails) {
        this.cyclicBarrier = cyclicBarrier;
        this.rocketDetails = rocketDetails;
    }

    @Override
    public void run() {
        System.out.println("Готовится деталь: " + rocketDetails);
        try {
            Thread.sleep(1000);
            System.out.println("Деталь готова: " + rocketDetails);
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
