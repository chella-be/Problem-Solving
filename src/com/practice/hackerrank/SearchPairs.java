package com.practice.hackerrank;

import java.util.Arrays;

public class SearchPairs {

    static int pairs(int k, int[] arr) {

        Arrays.sort(arr);

        int count = 0;
        for (int num : arr) {
            if (Arrays.binarySearch(arr, num + k) > 0) {
                count++;
            }
        }

        return count;
    }
}
