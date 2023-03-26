package by.digital.habbits.sandbox.multithreading.counter;

public class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }
}
