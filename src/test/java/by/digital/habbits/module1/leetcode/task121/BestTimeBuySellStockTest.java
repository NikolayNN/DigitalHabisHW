package by.digital.habbits.module1.leetcode.task121;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BestTimeBuySellStockTest {
    BestTimeBuySellStock.Solution solution = new BestTimeBuySellStock.Solution();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void test(int[] given, int expected) {
        int actual = solution.maxProfit(given);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[]{7, 1, 5, 3, 6, 4}, 5),
                arguments(new int[]{7, 6, 4, 3, 1}, 0),
                arguments(new int[]{1}, 0),
                arguments(new int[]{3, 2, 6, 5, 0, 3}, 4)
        );
    }
}