package by.digital.habbits.sandbox.concurrent.pool;

import lombok.SneakyThrows;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    @SneakyThrows
    public static void main(String[] args) {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
//        threadPool.schedule(() -> System.out.println("run!"), 3L, TimeUnit.SECONDS);
        threadPool.scheduleAtFixedRate(() -> System.out.println("run!"), 2L, 3L, TimeUnit.SECONDS);

//        threadPool.shutdown();
//        threadPool.awaitTermination(1L, TimeUnit.HOURS);
    }

    private static void fixedThreadPool() throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000L);
            System.out.println("it's callable");
            return 1;
        });
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
}
