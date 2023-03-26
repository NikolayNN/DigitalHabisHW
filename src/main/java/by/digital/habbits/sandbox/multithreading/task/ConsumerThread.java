package by.digital.habbits.sandbox.multithreading.task;

import java.util.Queue;

public class ConsumerThread implements Runnable {
    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer value = list.remove();
                    System.out.println("Consumer get value: " + value + ". Size: " + list.size());
                } else {
                    System.out.println("list is empty");
                }
                try {
                    int random = RandomUtil.getRandom();
                    System.out.println("Consumer wait: " + random + " ms");
                    list.notifyAll();
                    list.wait(random);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
