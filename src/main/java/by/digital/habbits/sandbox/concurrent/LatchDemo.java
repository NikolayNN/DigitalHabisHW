package by.digital.habbits.sandbox.concurrent;

import by.digital.habbits.sandbox.concurrent.countdownlatch.Rocket;
import by.digital.habbits.sandbox.concurrent.countdownlatch.RocketDetails;
import by.digital.habbits.sandbox.concurrent.countdownlatch.RocketDetailsRunnable;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(RocketDetails.values().length);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Rocket(countDownLatch));
        Arrays.stream(RocketDetails.values())
                .map(d -> new RocketDetailsRunnable(countDownLatch, d))
                .forEach(executorService::submit);
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
