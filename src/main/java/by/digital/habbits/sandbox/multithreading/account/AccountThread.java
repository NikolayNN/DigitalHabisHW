package by.digital.habbits.sandbox.multithreading.account;

public class AccountThread extends Thread {
    private final Account from;
    private final Account to;

    public AccountThread(Account from, Account to) {
        this.from = from;
        this.to = to;
    }

    /**
     *                                Deadlock
     * thread1 ------ monitor(account1) -> monitor(account2)
     *
     * thread2 ------ monitor(account2) -> monitor(account1)
     */

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            synchronized (from) {
                synchronized (to) {
                    if (from.takeOff(10)) {
                        to.add(10);
                    }
                }
            }
        }
    }
}
