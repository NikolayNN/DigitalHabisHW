package by.digital.habbits.module1.leetcode.task121;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellStockTest {
    BestTimeBuySellStock.Solution solution = new BestTimeBuySellStock.Solution();

    @Test
    void name() {
        var given = new int[]{7, 1, 5, 3, 6, 4};
        int actual = solution.maxProfit(given);
        System.out.println(actual);
        assertEquals(5, actual);
    }

    @Test
    void name2() {
        var given = new int[]{7, 6, 4, 3, 1};
        int actual = solution.maxProfit(given);
        System.out.println(actual);
        assertEquals(0, actual);
    }

    @Test
    void name3() {
        var given = new int[]{1};
        int actual = solution.maxProfit(given);
        System.out.println(actual);
        assertEquals(0, actual);
    }

    @Test
    void name4() {
        var given = new int[]{3, 2, 6, 5, 0, 3};
        int actual = solution.maxProfit(given);
        System.out.println(actual);
        assertEquals(4, actual);
    }
}