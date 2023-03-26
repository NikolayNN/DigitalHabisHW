package by.digital.habbits.module2.leetcode.task1114;

import java.util.concurrent.Semaphore;

public class PrintInOrder {

    static class Foo {

        private final Semaphore run2 = new Semaphore(0);
        private final Semaphore run3 = new Semaphore(0);

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            run2.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            run2.acquire();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            run3.release();
        }

        public void third(Runnable printThird) throws InterruptedException {
            run2.acquire();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}
