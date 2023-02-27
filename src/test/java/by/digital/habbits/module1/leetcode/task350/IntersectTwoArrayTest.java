package by.digital.habbits.module1.leetcode.task350;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntersectTwoArrayTest {

    protected final IntersectTwoArrayBase.Solution solutionSort = new IntersectTwoArrayBase.SolutionSort();

    @Test
    void test1() {
        var given1 = new int[]{1, 2, 2, 1};
        var given2 = new int[]{2, 2};
        var actual = solutionSort.intersect(given1, given2);
        assertArraysIgnoreOrder(new int[]{2, 2}, actual);
    }

    @Test
    void test2() {
        var given1 = new int[]{4, 9, 5};
        var given2 = new int[]{9, 4, 9, 8, 4};
        var actual = solutionSort.intersect(given1, given2);
        assertArraysIgnoreOrder(new int[]{4, 9}, actual);
    }

    protected void assertArraysIgnoreOrder(int[] expected, int[] actual) {
        System.out.println("actual: " + Arrays.toString(actual));
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}