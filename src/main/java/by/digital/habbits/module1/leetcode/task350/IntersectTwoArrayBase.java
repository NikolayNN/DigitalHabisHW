package by.digital.habbits.module1.leetcode.task350;

import java.util.*;

public class IntersectTwoArrayBase {

    public interface Solution {
        int[] intersect(int[] nums1, int[] nums2);
    }

    public static class SolutionSort implements Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            List<Integer> result = new ArrayList<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i++]);
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    i++;
                }
            }
            return toArray(result);
        }

        private int[] toArray(List<Integer> list) {
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
