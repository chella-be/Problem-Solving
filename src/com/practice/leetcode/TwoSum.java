package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Method to find target in in unsorted array.
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(target - nums[i], i);
            }
        }

        return result;
    }

    /**
     * Method to find target sum in sorted array (Ascending order)
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] numbers, int target) {

        int[] result = new int[2];

        if (numbers.length == 0) {
            return result;
        }

        for (int i = 0, j = numbers.length - 1; i < j; ) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
        }

        return new int[2];
    }
}
