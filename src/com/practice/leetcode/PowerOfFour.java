package com.practice.leetcode;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;

        int res = num & (num - 1);

        return res == 0 && (num % 10 == 4 || num % 10 == 6);
    }
}
