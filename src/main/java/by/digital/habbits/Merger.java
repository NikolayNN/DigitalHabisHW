package by.digital.habbits;

import java.util.function.BiFunction;

public class Merger {
    int a;
    int b;

    public Merger(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int merge(BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }
}
