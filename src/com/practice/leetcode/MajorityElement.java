package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int length = nums.length / 2;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getValue();
            if (num > length) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
