package com.practice.hackerrank;

public class ArrRotation {

    public static void rotate(int[] nums, int k) {

        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        if (nums.length < k) {
            k = k % nums.length;
        }

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        for (; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}
