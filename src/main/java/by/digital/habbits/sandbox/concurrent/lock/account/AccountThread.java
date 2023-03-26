package by.digital.habbits.sandbox.concurrent.lock.account;

public class AccountThread extends Thread {
    private final Account from;
    private final Account to;

    public AccountThread(Account from, Account to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Deadlock
     * thread1 ------ monitor(account1) -> monitor(account2)
     * <p>
     * thread2 ------ monitor(account2) -> monitor(account1)
     */

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            lockAccounts();
            try {
                if (from.takeOff(10)) {
                    to.add(10);
                }
            } finally {
                unlockAccounts();
            }
        }
    }

    private void lockAccounts() {
        while (true) {
            boolean fromLockResult = from.getLock().tryLock();
            boolean toLockResult = to.getLock().tryLock();
            if (fromLockResult && toLockResult) {
                break;
            }
            if (fromLockResult) {
                from.getLock().unlock();
            }
            if (toLockResult) {
                to.getLock().unlock();
            }
        }
    }

    private void unlockAccounts() {
        from.getLock().unlock();
        to.getLock().unlock();
    }
}
