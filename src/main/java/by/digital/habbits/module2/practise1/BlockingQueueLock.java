package by.digital.habbits.module2.practise1;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RequiredArgsConstructor
public class BlockingQueueLock<T> implements BlockingQueue<T> {
    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;
    private int size = 0;

    private final Lock lock = new ReentrantLock();
    private final Condition isNotFull = lock.newCondition();
    private final Condition isNotEmpty = lock.newCondition();

    @SneakyThrows
    @Override
    public void put(T e) {
        lock.lock();
        while (size == capacity) {
            isNotFull.await();
        }
        queue.add(e);
        size++;
        isNotEmpty.signal();
        lock.unlock();
    }

    @SneakyThrows
    @Override
    public T take() {
        lock.lock();
        while (size == 0) {
            isNotEmpty.await();
        }
        T poll = queue.poll();
        size--;
        isNotFull.signal();
        lock.unlock();
        return poll;
    }
}
