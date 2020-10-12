package com.practice.leetcode;

public class TrailingZeros {

    public static int trailingZeroes(int num) {

        int count = 0;
        int occured = 5;
        while (num >= 5) {
            count += Math.floor(num / occured);
            num = (int) Math.floor(num / occured);
        }

        return count;
    }
}
