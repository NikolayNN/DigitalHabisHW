package by.digital.habbits.module2.practise1;

import lombok.SneakyThrows;

public interface BlockingQueue<T> {
    @SneakyThrows
    void put(T e);

    @SneakyThrows
    T take();
}
