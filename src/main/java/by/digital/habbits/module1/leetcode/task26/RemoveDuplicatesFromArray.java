package by.digital.habbits.module1.leetcode.task26;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            int actualLength = nums.length;
            int i = 0;
            while (i < actualLength) {
                int startShiftIndex = i;
                while (i < actualLength - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
                int shift = i - startShiftIndex;
                actualLength = move(nums, startShiftIndex, shift, actualLength);
                i = (i - shift) + 1;
            }
            return actualLength;
        }

        // low memory using
        public int move(int[] nums, int startShiftIndex, int shift, int actualLength) {
            System.arraycopy(nums, startShiftIndex+shift, nums, startShiftIndex, (actualLength - (startShiftIndex+shift)));
            return actualLength - shift;
        }

            // low memory using
//        public int move(int[] nums, int startShiftIndex, int shift, int actualLength) {
//            for (int i = startShiftIndex + shift; i < actualLength; i++) {
//                nums[startShiftIndex++] = nums[i];
//            }
//            return actualLength - shift;
//        }
    }
}
