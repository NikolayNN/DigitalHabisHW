package by.digital.habbits.sandbox.multithreading.queue;

import lombok.SneakyThrows;

import java.util.Queue;

public class BuyerThread implements Runnable {
    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @SneakyThrows
    @Override
    public void run() {

        synchronized (cashBoxes) {
            while (true) {
                if (!cashBoxes.isEmpty()) {
                    CashBox cashBox = cashBoxes.remove();

                    System.out.printf("""
                            %s обслуживается в кассе %s
                            """, Thread.currentThread().getName(), cashBox);
                    cashBoxes.wait(5);

                    System.out.printf("""
                            %s освобождаю кассу %s
                            """, Thread.currentThread().getName(), cashBox);

                    cashBoxes.add(cashBox);
                    cashBoxes.notify();
                    break;
                } else {
                    System.out.printf("""
                            %s ожидает свободную кассу
                            """, Thread.currentThread().getName());
                    cashBoxes.wait();
                }
            }
        }
    }
}

