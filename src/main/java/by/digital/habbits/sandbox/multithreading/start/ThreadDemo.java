package by.digital.habbits.sandbox.multithreading.start;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread thread1 = new SimpleThread();
        System.out.println(thread1.getState());

        thread1.start();
        System.out.println(thread1.getState());
        thread1.join();
        System.out.println(thread1.getState());
    }
}
