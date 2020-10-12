package com.practice.leetcode;

public class ReverseBits {

    public static int reverseBits(int n) {

        int power = 31;
        int result = 0;

        while (power >= 0) {
            result += (n & 1) << power;
            power--;
            n = n >> 1;
        }

        return result;
    }
}
