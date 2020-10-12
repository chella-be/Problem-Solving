package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {

        Set<Integer> visits = new HashSet<>();


        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current /= 10;
            }

            if (visits.contains(sum)) {
                return false;
            }
            visits.add(sum);
            n = sum;
        }

        return true;
    }
}
