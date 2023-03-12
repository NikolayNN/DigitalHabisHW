package by.digital.habbits.module1.leetcode.task242;

import java.util.Arrays;

public class ValidAnagram {
    public static class SolutionSort {
        public boolean isAnagram(String a, String b) {
            return Arrays.equals(toSortedChars(a), toSortedChars(b));
        }

        private char[] toSortedChars(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return chars;
        }
    }

    public static class SolutionCounter {
        private static final char A_CHAR = 'a';

        public boolean isAnagram(String a, String b) {
            if (a.length() != b.length()) {
                return false;
            }
            var counter = new int[26];
            for (int i = 0; i < a.length(); i++) {
                counter[charIdx(a.charAt(i))]++;
                counter[charIdx(b.charAt(i))]--;
            }
            return hasOnlyZeros(counter);
        }

        private int charIdx(char ch) {
            return ch - A_CHAR;
        }

        private boolean hasOnlyZeros(int[] arr) {
            for (int i : arr) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
