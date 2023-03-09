package by.digital.habbits.module1.leetcode.task121;

public class BestTimeBuySellStock {
    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length <= 1) {
                return 0;
            }
            int buy = prices[0];
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (buy < prices[i]) {
                    profit = Math.max(prices[i] - buy, profit);
                } else {
                    buy = prices[i];
                }
            }
            return Math.max(profit, 0);
        }
    }
}