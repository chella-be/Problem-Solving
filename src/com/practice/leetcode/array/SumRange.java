package com.practice.leetcode.array;

public class SumRange {

    private int[] nums;

    public SumRange(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int result = 0;

        boolean isOdd = (j - i + 1) % 2 == 1;

        while (i < j) {
            result += nums[i] + nums[j];
            i++;
            j--;
        }

        if (isOdd) result += nums[i];

        return result;
    }
}
