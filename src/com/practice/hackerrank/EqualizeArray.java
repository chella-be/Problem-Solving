package com.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class EqualizeArray {

    static int equalizeArray(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int maxCount = 1;
        for (int num : arr) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, ++count);
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                map.put(num, 1);
            }
        }

        return arr.length - maxCount;
    }
}
