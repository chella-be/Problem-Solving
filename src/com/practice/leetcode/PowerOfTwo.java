package com.practice.leetcode;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

        if(n <= 0) return false;
        int result = n & (n - 1);

        return result == 0;
    }
}
