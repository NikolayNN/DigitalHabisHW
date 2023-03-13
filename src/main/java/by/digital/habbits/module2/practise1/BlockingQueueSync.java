package by.digital.habbits.module2.practise1;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.LinkedList;
import java.util.Queue;

@RequiredArgsConstructor
public class BlockingQueueSync<T> implements BlockingQueue<T> {
    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;
    private int size = 0;

    @Override
    @SneakyThrows
    public synchronized void put(T e) {
        while (size == capacity) {
            queue.wait();
        }
        queue.add(e);
        size++;
        queue.notifyAll();
    }

    @Override
    @SneakyThrows
    public synchronized T take() {
        while (size == 0) {
            queue.wait();
        }
        T v = queue.poll();
        size--;
        queue.notifyAll();
        return v;
    }

}
