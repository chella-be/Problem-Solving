package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {

    static int[] missingNumbers(int[] arr, int[] brr) {

        int[] result = new int[10001];

        for (int num : arr) {
            result[num]--;
        }

        for (int num : brr) {
            result[num]++;
        }

        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
