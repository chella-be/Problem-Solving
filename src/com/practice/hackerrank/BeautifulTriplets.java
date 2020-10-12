package com.practice.hackerrank;

import java.util.Arrays;

public class BeautifulTriplets {

    static int beautifulTriplets(int d, int[] arr) {

        int count = 0;

        for (int a : arr) {
            if (Arrays.binarySearch(arr, a + d) > 0 &&
                    Arrays.binarySearch(arr, a + d * 2) > 0) {
                ++count;
            }
        }

        return count;
    }

}
