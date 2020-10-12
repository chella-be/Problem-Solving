package com.practice.leetcode;

public class MaxProfit {

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static int maxProfit1(int[] prices) {

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (max < price - min) {
                max = price - min;
            }
        }

        return max;
    }

}
