package by.digital.habbits.sandbox.concurrent.barrier.countdownlatch;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(RocketDetails.values().length, () -> System.out.println("Пуск"));

        ExecutorService pool = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetails.values())
                .map(d -> new RocketDetailsRunnable(barrier, d))
                .forEach(pool::submit);
    }
}
