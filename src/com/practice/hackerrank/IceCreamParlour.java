package com.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlour {


    static int[] icecreamParlor(int m, int[] arr) {

        int length = arr.length;
        Map<Integer, Integer> results = new HashMap<>(length / 2);
        for (int k = 0; k < length; k++) {
            if (arr[k] < m) {
                if (results.containsKey(arr[k])) {
                    int[] res = new int[2];
                    res[0] = results.get(arr[k]) + 1;
                    res[1] = k + 1;
                    return res;
                } else {
                    results.put(m - arr[k], k);
                }
            }
        }

        return new int[]{};
    }
}
