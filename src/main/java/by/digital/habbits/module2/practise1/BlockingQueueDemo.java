package by.digital.habbits.module2.practise1;

import lombok.SneakyThrows;


import java.util.concurrent.ThreadLocalRandom;

public class BlockingQueueDemo {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new BlockingQueueLock<>(3);
        Thread putter = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                int e = ThreadLocalRandom.current().nextInt(0, 10);
                queue.put(e);
                System.out.printf("""
                        %s put: %s
                        """, Thread.currentThread().getName(), e);
                sleep(100);
            }
        });

        Thread taker = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                Integer e = queue.take();
                System.out.printf("""
                        %s take: %s
                        """, Thread.currentThread().getName(), e);
                sleep(500);
            }
        });

        putter.start();
        taker.start();
    }

    @SneakyThrows
    public static void sleep(int milis) {
        Thread.sleep(milis);
    }

}
