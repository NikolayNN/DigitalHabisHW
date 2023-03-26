package by.digital.habbits.sandbox.multithreading.task;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                list.add(RandomUtil.getRandom());
                list.notifyAll();
                try {
                    int random = RandomUtil.getRandom();
                    int randomWait = random;
                    System.out.println("Producer add value: " + random + ". Size: " + list.size());
                    System.out.println("Producer waits: " + randomWait);
                    list.wait(randomWait);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
