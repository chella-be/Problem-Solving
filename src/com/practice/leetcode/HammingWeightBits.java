package com.practice.leetcode;

public class HammingWeightBits {

    public static int hammingWeight(int n) {
        int count = 0;
        int bitCount = 31;
        while (bitCount >= 0) {
            count += n & 1;
            bitCount--;
            n = n >> 1;
        }
        return count;
    }
}
