package com.practice.hackerrank;

import java.util.List;

public class SherlockAndArray {

    static String balancedSums(List<Integer> arr) {

        if (arr.size() == 1) {
            return "YES";
        }

        int len = arr.size();
        int low = 0;
        int high = len - 1;

        int leftSum = 0;
        int rightSum = 0;
        while (low < len && high > 0) {
            if (leftSum == rightSum && low == high) {
                return "YES";
            } else if (leftSum < rightSum) {
                leftSum += arr.get(low);
                low++;
            } else {
                rightSum += arr.get(high);
                high--;
            }
        }

        if (leftSum == rightSum) {
            return "YES";
        }

        return "NO";
    }
}
