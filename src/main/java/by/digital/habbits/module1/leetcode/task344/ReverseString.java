package by.digital.habbits.module1.leetcode.task344;

public class ReverseString {
    public static class Solution {
        public void reverseString(char[] chars) {
            int i = 0;
            int j = chars.length - 1;
            while (i <= j) {
                swap(i++, j--, chars);
            }
        }

        public void swap(int i, int j, char[] chars) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }
}
