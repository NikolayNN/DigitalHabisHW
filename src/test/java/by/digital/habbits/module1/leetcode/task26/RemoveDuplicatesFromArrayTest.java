package by.digital.habbits.module1.leetcode.task26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromArrayTest {
    RemoveDuplicatesFromArray.Solution solution = new RemoveDuplicatesFromArray.Solution();


    @Test
    void testMove() {
        int[] given = new int[]{1, 2, 2, 2, 2, 3};
        int actualLength = solution.move(given, 1, 4, 6);

        System.out.println("actual: " + Arrays.toString(given));

        assertSame(2, actualLength);
        assertArrayEquals(new int[]{1, 3, 2, 2, 2, 3}, given);
    }

    @Test
    void testArrayEmpty() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{};
        int actualLength = solution.removeDuplicates(given);

        assertSame(0, actualLength);
    }

    @Test
    void testArrayLengthOne() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{99};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{99}, getActualArray(given, actualLength));
    }

    @Test
    void test1() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{1, 2, 2, 3};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{1, 2, 3}, getActualArray(given, actualLength));
    }

    @Test
    void test2() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{1, 1, 2, 2};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{1, 2}, getActualArray(given, actualLength));
    }

    @Test
    void test3() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{1, 1, 2, 2, 3, 3};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{1, 2, 3}, getActualArray(given, actualLength));
    }

    @Test
    void test4() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, getActualArray(given, actualLength));
    }

    @Test
    void test5() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{1, 1, 1};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{1}, getActualArray(given, actualLength));
    }

    @Test
    void test6() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{0, 0, 1, 1, 1};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{0, 1}, getActualArray(given, actualLength));
    }

    @Test
    void test7() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{0, 1, 1, 1, 2};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{0, 1, 2}, getActualArray(given, actualLength));
    }

    @Test
    void test8() {
        var solution = new RemoveDuplicatesFromArray.Solution();
        int[] given = new int[]{1, 1, 1, 2, 2};
        int actualLength = solution.removeDuplicates(given);

        assertArrayEquals(new int[]{1, 2}, getActualArray(given, actualLength));
    }

    private int[] getActualArray(int[] nums, int length) {
        var actual = new int[length];
        System.arraycopy(nums, 0, actual, 0, length);
        System.out.println("actual: " + Arrays.toString(actual));
        return actual;
    }
}