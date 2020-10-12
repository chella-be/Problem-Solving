package com.practice.leetcode.array;

public class MaximumSumSubArray {

    public static int maxSubArray(int[] nums) {

        int res;
        int max = res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max + nums[i]);
            if (max > res) {
                res = max;
            }
        }

        return res;
    }
}
