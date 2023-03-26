package by.digital.habbits.sandbox.concurrent.queue;

import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {
    private final BlockingQueue<CashBox> cashBoxes;

    public BuyerThread(BlockingQueue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @SneakyThrows
    @Override
    public void run() {
        CashBox cashbox = cashBoxes.take();
        System.out.printf("""
                %s обслуживается в кассе %s
                """, Thread.currentThread().getName(), cashbox);
        Thread.sleep(5);
        cashBoxes.put(cashbox);

        System.out.printf("""
                %s освобождаю кассу %s
                """, Thread.currentThread().getName(), cashbox);
    }
}

