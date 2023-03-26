package by.digital.habbits.sandbox.multithreading.task;

import java.util.Random;

public final class RandomUtil {
    private RandomUtil() {
    }

    private static final Random RANDOM = new Random();
    private static final int DEFAULT_BOUND = 10;

    public static int getRandom() {
        return getRandom(DEFAULT_BOUND);
    }

    public static int getRandom(int bound) {
        return RANDOM.nextInt(bound);
    }
}
