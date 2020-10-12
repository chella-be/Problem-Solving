package com.practice.leetcode.array;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int sum = 0;
        int bigNum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            if (bigNum < num) {
                bigNum = num;
            }
        }

        int total = (bigNum * (bigNum + 1)) / 2;

        return total - sum;
    }

}
