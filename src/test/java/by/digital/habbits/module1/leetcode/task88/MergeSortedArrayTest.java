package by.digital.habbits.module1.leetcode.task88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    MergeSortedArray.Solution solution = new MergeSortedArray.Solution();

    @Test
    void test1() {
        var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        var nums2 = new int[]{2, 5, 6};

        solution.merge(nums1, 3, nums2, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void test2() {
        var nums1 = new int[]{0};
        var nums2 = new int[]{1};

        solution.merge(nums1, 0, nums2, 1);

        assertArrayEquals(new int[]{1}, nums1);
    }
}